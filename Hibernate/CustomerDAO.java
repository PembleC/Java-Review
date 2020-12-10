
public class CustomerDao {
    /*Inserting a new Customer details into database*/
    public void createCustomer()throws Exception{
        SessionFactory sessionFactory=null;
        Session session=null;
        try {
            sessionFactory=HibernateUtility.createSessionFactory();                      //creating session factory
            session=sessionFactory.openSession();                                        //creating session instance
            CustomerEntity ce=new CustomerEntity();                                      //creating the entity instace
            ce.setCustomerId(5004);                                  //populating the entity instance
            ce.setCustomerName("Kiran");

            session.getTransaction().begin();                                            //Begin the transaction
            //customerId=(Integer)session.save(ce);                           // Allow for auto generater to do its work
            session.persist(ce);                                                         //persist the entity in db
            //Integer customerPK = (Integer)session.save(ce);     // returns identifier value, type Serializalbe
            session.getTransaction().commit();                                           // Saves the changes in DB      .rollback() reverts the changes
       }catch (HibernateException exception) {
            throw new Exception("DAO.TECHNICAL_ERROR");
       }catch (Exception exception) {
            throw exception;
       }finally {
            if(session.isOpen() || session!=null)
                  session.close();                                                       //Closing session instance
            }
       }


       public Customer getCustomerDetails(Integer customerId)throws Exception{
            SessionFactory sessionFactory=null;
            Session session=null;
            Customer customer=null;
            try {
                 sessionFactory=HibernateUtility.createSessionFactory();
                 session=sessionFactory.openSession();
                 //CustomerEntity ce=(CustomerEntity) session.get(CustomerEntity.class, customerId);    // .class passes it as a class
                 CustomerEntity ce=(CustomerEntity) session.load(CustomerEntity.class, customerId);     // Gives more information if null
                 if(ce!=null){
                       customer=new Customer();
                       customer.setCustomerId(ce.getCustomerId());                                      // No need for Transaction because No Change in Data
                       customer.setCustomerName(ce.getCustomerName());
                 }
            }catch (HibernateException exception) {
                 throw new Exception("DAO.TECHNICAL_ERROR");
            }catch (Exception exception) {
                 throw exception;
            }finally {
                 if(session.isOpen()|| session!=null)
                       session.close();
                 }
            return customer;
      }




    public Integer updateCustomerDetails(Integer id, Long newName)throws Exception{
    SessionFactory sessionFactory= null;
    Session session=null;
    Integer customerId=null;
    try {
         sessionFactory=HibernateUtility.createSessionFactory();
         session=sessionFactory.openSession();
         CustomerEntity ce=(CustomerEntity) session.get(CustomerEntity.class, id);
         if(ce!=null){
               customerId=ce.getCustomerId();
               session.getTransaction().begin();
               ce.setCustomerName(newName);                   // Key aspect here
               session.getTransaction().commit();
         }
  }catch (HibernateException exception) {
         throw new Exception("DAO.TECHNICAL_ERROR");
    }catch (Exception exception) {
         throw exception;
    }finally {
         if(session.isOpen()|| session!=null)
               session.close();
         }
    return customerId;
    }



    public Integer deleteCustomerDetails(Integer customerId)throws Exception{
       SessionFactory sessionFactory= null;
       Session session=null;
       Integer custId=null;
       try {
            sessionFactory=HibernateUtility.createSessionFactory();
            session=sessionFactory.openSession();
            CustomerEntity ce=(CustomerEntity) session.get(CustomerEntity.class, customerId);
            if(ce!=null){
                custId=ce.getCustomerId();
                session.getTransaction().begin();
                session.delete(ce);                   // Key aspect here
                session.getTransaction().commit();
            }
	   }catch (HibernateException exception) {
            throw new Exception("DAO.TECHNICAL_ERROR");
       }catch (Exception exception) {
            throw exception;
       }finally {
            if(session.isOpen()|| session!=null)
                  session.close();
            }
        return custId;
       }



}
