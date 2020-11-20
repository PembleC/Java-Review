// Inheritance - Assignment 1
// Carson Pemble
// 11/02/2020

    class Employee {

        //Implement your code here
        private int employeeId;
        private String employeeName;
        private double salary;

        public Employee(int employeeId, String employeeName){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }


        //Uncomment the below method after implementation before verifying
        //DO NOT MODIFY THE METHOD
    ///*
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    //*/
    }


    class PermanentEmployee extends Employee {

        //Implement your code here
        private double basicPay;
        private double hra;
        private float experience;

        public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
            super(empId, name);
            this.basicPay = basicPay;
            this.hra = hra;
            this.experience = experience;
        }

        public void calculateMonthlySalary(){
          float variable = 0;
            if(experience >= 10){
              variable = 0.12f;
            } else if(experience >= 5 && experience < 10){
              variable = 0.07f;
            }else if(experience >= 3 && experience < 5){
              variable = 0.05f;
            } else {variable = 0.00f;}

            double salary = basicPay + hra + (variable*basicPay);
            this.setSalary(salary);
        }

        public float getExperience() {
            return experience;
        }

        public void setExperience(float experience) {
            this.experience = experience;
        }

        public double getHra() {
            return hra;
        }

        public void setHra(double hra) {
            this.hra = hra;
        }

        public double getBasicPay() {
            return basicPay;
        }

        public void setBasicPay(double basicPay) {
            this.basicPay = basicPay;
        }

        //Uncomment the below method after implementation before verifying
        //DO NOT MODIFY THE METHOD
    ///*
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    //*/
    }

    class ContractEmployee extends Employee {

        //Implement your code here
        private double wage;
        private float hoursWorked;

        public ContractEmployee(int empId, String name,double wage, float hoursWorked) {
            super(empId, name);
            this.wage = wage;
            this.hoursWorked = hoursWorked;
        }

        public void calculateSalary(){
          double salary = hoursWorked * wage;
          this.setSalary(salary);
        }

        public float getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(float hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public double getWage() {
            return wage;
        }

        public void setWage(double wage) {
            this.wage = wage;
        }

        //Uncomment the below method after implementation before verifying
        //DO NOT MODIFY THE METHOD
    ///*
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    //*/
    }

    class Tester10 {

        public static void main(String[] args) {

            PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
            permanentEmployee.calculateMonthlySalary();
            System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);

            ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
            contractEmployee.calculateSalary();
            System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);

            //Create more objects for testing your code
        }

    }
