// String - Assignment 2
// Carson Pemble
// 10/30/2020

class Tester32{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
        int len = str.length();
        String newString = "";

        int index = 0;
        for (int i=len; i>0; i--){
          char c = str.charAt(i-1);
          //System.out.println("This is the character: " + c);
          newString += c;
        }

        System.out.println("This is the reverse: " + newString);

        return str.equals(newString);
	}

	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
