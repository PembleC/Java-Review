// String - Assignment 1
// Carson Pemble
// 10/30/2020

class Tester31{

    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
        String special = "!@#$%^&*()";

        // Take length of string
        int len = str.length();

        // regular expression for check char is special
        // or not.
        String regx = "[a-zA-Z0-9\\s+]";

        // traverse string
        String res1 = "", res2 = "";
        for (int i = 0; i < len; i++) {

            char c = str.charAt(i);

            // check char at index i is a special char
            if (String.valueOf(c).matches(regx))
               res1 = res1 + c;
            else
               res2 = res2 + c;
        }
        return res1 + res2;
        }

        // for(int i=0; i<str.length(); i++){
        //     if(special.contains(str.charAt(i))){
        //       str.concat(str.charAt(i));
        //     }

        // str = str.replace("@", "");
        // str = str.replace("#", "");
        // str = str.replace("!", "");
        // str = str.replace("&", "");
        // str = str.replace("*", "");
        // str = str.replace("$", "");
        // str = str.replace("%", "");
        // str = str.replace("^", "");
        // str = str.replace(")", "");
        // str = str.replace("(", "");
        //return str;
	//}

	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}

}
