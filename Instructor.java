package employees;

public class Instructor extends Employee{
  private int appointmentMonths;

  public Instructor(String name, int id, double salary, int appointmentMonths){
    super(name, id, salary);    // uses the Employee class constructor
    this.appointmentMonths = appointmentMonths;
  }

}
