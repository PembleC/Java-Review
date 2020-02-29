package employees;

class Employee {
  private String name;
  private int id;
  private double payRate;

  public Employee(String name, int id, double payRate) {
    this.name = name;
    this.id = id;
    this.payRate = payRate;
  }

  public String getName() {
    return this.name;
  }

  public double getPayRate() {
    return this.payRate;
  }

  public double getMonthlyPay(double hoursWorked) {
    return this.payRate * hoursWorked;
  }
}
