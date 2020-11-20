// Static - Assignment 3
// Carson Pemble
// 10/29/2020

class Booking{
    //Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static {
      int seatsAvailable = 400;
    }

    public Booking(String customerEmail, int seatsRequired){
      this.customerEmail = customerEmail;
      this.seatsRequired = seatsRequired;
      if(seatsRequired <= getSeatsAvailable()){
        isBooked = true;
        setSeatsAvailable(getSeatsAvailable() - seatsRequired);
      }
      else{ isBooked = false; }
    }

    public String getCustomerEmail(){
      return this.customerEmail;
    }
    public void setCustomerEmail(String customerEmail){
      this.customerEmail = customerEmail;
    }

    public int getSeatsRequired(){
      return this.seatsRequired;
    }
    public void setSeatsRequired(int seatsRequired){
      this.seatsRequired = seatsRequired;
    }

    public boolean isBooked(){
      return isBooked;
    }
    public void setBooked(boolean isBooked){
      this.isBooked = isBooked;
    }

    public static int getSeatsAvailable(){
      return seatsAvailable;
    }
    public static void setSeatsAvailable(int seatsAvailable){
      Booking.seatsAvailable = seatsAvailable;
    }
}

class Tester30 {
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 250);
        Booking booking3 = new Booking("jill@email.com", 101);

        //Create more objects and add them to the bookings array for testing your code

        Booking[] bookings = { booking1, booking2, booking3 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}
