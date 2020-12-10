public class HibernateUtility {
   private static SessionFactory factory;
    public static SessionFactory createSessionFactory(){
        Configuration cfg = new Configuration().configure();    //1
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();   //2
        factory = cfg.buildSessionFactory(serviceRegistry);     //3
        return factory;
    }

    public static SessionFactory getSessionFactory() {
        if (factory.isClosed() ||  factory==null)
            return createSessionFactory();
        else
            return factory;
    }
    public static void closeSessionFactory() {
        if(!factory.isClosed() ||  factory!=null ){
            factory.close();                                    //4
        }
    }
}
