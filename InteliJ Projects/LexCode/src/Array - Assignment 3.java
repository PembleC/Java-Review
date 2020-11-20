// Array - Assignment 3
// Carson Pemble
// 10/29/2020

class Tester5 {

   public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
       int[] output = new int[15];
       int index = 0;
       int start = 0;

       while(true){
         if(year % 4 == 0 && year % 100 != 0){
           output[index] = year;
           start = year;
           index++;
         }

         if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
           output[index] = year;
           start = year;
           index++;
         }

          // if(start != 0){
          //   start = start + 4;
          //   output[index] = start;
          //   index++;
          // }

       year++;

       if(output[14] != 0)
              break;


       }


        return output;
   }

   public static void main(String[] args) {
       int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}
