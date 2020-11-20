//JAVA - Cheat Sheet

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testing {

    public static void main(String args[]) {

        System.out.println("\n- - - String and Int Conversions - - -");
        int ivar = 111;
        String str = String.valueOf(ivar);
        System.out.println("Num to String is: " + str);
        System.out.println("ivar + str is: " + (ivar + str));

        String strNum = "1234";
        int inum = Integer.parseInt(strNum);
        System.out.println("String to Num is: " + inum);
        System.out.println("ivar + strNum is: " + (ivar + inum));


        System.out.println("\n- - - Array Lists - - -");
        List<Integer> array = new ArrayList();              // Create Int Array
        array.add(1);
        array.add(2);                                       // Add values
        array.add(3);
        System.out.println(array);
        System.out.println(array.indexOf(1));           // Get index of value 1
        System.out.println(array.get(2));              // Get Value at index 2
        array.remove(2);                        // Remove value at index 2
        System.out.println(array);                   // Print
        array.clear();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(4);


//        System.out.println("\n- - - Scanners - - -");
//        Scanner input = new Scanner(System.in);
//        double num1 = input.nextDouble();
//        String a = input.nextLine();
//        String b = input.next();
//
//        while(input.hasNext()){
//            array.add(Integer.valueOf(input.next()));
//        }


        System.out.println("\n- - - Mock Hands-On Problem 1 - - -");
        List<Integer> uniqueArray = new ArrayList();              // Create Int Array
        int arraySize = array.size();                             // Calculate Size
        String curNum = "";
        int curNumInt = 0;

        for(int i=0; i<arraySize; i++){
            for(int j=0; j<arraySize; j++) {
                for(int k=0; k<arraySize; k++) {
                    curNum = "";
                    if(i!=j && i!=k && j!=k){
                        curNum += array.get(i).toString();
                        curNum += array.get(j).toString();
                        curNum += array.get(k).toString();
                        //System.out.println("curNum: " + curNum);

                        curNumInt = Integer.valueOf(curNum);
                        if(!uniqueArray.contains(curNumInt)){
                            uniqueArray.add(curNumInt);
                        }
                    }

                }
            }
        }

        System.out.println("Unique Array is: " + uniqueArray);
        int max = 0;
        for (Integer integer : uniqueArray) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println(max + ", " + uniqueArray.size());



        System.out.println("\n- - - Mock Hands-On Problem 2 - - -");

        int num1 = 9;
        int num2 = 101;
        int num3 = 1234321;
        int num4 = 930;
        int num5 = 75193;

        long log = 35000L;
        String name = "Alex";
        char character = 'a';
        int break$ = 6;

        double salary = 2100.5;
        double totalSal = salary * (1 + 8 /100);
        System.out.println(totalSal);


        System.out.println(checkPalindrome(num1));
        System.out.println(checkPalindrome(num2));
        System.out.println(checkPalindrome(num3));
        System.out.println(checkPalindrome(num4));
        System.out.println(checkPalindrome(num5));






    }


    private static boolean checkPalindrome(int number){
        int numCopy = number;
        int newNum = 0;
        String  newNumStr = "";

        if(numCopy < 9)
            return true;

        while(numCopy > 0){
            newNumStr += String.valueOf(numCopy % 10);
            numCopy = numCopy / 10;
        }

        //System.out.println(newNumStr);
        newNum = Integer.valueOf(newNumStr);
        if(newNum == number){
            return true;
        } else {
            return false;
        }
    }



}
