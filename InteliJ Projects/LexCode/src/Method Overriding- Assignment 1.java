// Method Overriding- Assignment 1
// Carson Pemble
// 11/02/2020

class Faculty{
    //Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowancePercentage;

    public Faculty(String name, float basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 0.04f;
        this.carAllowancePercentage = 0.025f;
    }

    public double calculateSalary(){
        return basicSalary + (bonusPercentage*basicSalary) + (carAllowancePercentage*basicSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty{
    //Implement your code here
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation){
        super(name, basicSalary);
        this.designation = designation;
    }

    @Override
    public double calculateSalary() {
        double addition = 0;
        switch (designation){
            case "Accountant":
                addition = 10000.0;
                break;
            case "Clerk":
                addition = 7000.0;
                break;
            case "Peon":
                addition = 4500.0;
                break;
        }
        return super.calculateSalary() + addition;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

class Teacher extends Faculty{
    //Implement your code here
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification){
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() {
        double addition = 0;
        switch (this.qualification){
            case "Doctoral":
                addition = 20000.0;
                break;
            case "Masters":
                addition = 18000.0;
                break;
            case "Bachelors":
                addition = 15500.0;
                break;
            case "Associate":
                addition = 10000.0;
                break;
        }
        return super.calculateSalary() + addition;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}


class Tester27 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: "+teacher.getName());
        System.out.println("Qualification: "+teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: "+officeStaff.getName());
        System.out.println("Designation: "+officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0);

        //Create more objects for testing your code

    }
}
