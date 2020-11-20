// Array - Assignment 2
// Carson Pemble
// 10/29/2020

class Tester7 {

    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double[] details = new double[3];
        double average = 0;
        double more = 0;
        double less = 0;

        for(double num : salary){
          //System.out.println("salary: "+ num);
          average += num;
        }

        average = average / salary.length;

        for(double num : salary){
          if(num > average){
            more++;
          } else if (num < average) { less++;}
        }

        details[0] = average;
        details[1] = more;
        details[2] = less;

        return details;


    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);

        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
