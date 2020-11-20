// String - Assignment 3
// Carson Pemble
// 10/30/2020

class Tester33 {
    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
      int strLen = str.length();
      int len = str.length();
      String newString = "";
      String curString = str;
      boolean done = false;

      for(int i=0; i<strLen; i++){
        int space = curString.indexOf(' ');
        if(done == true){System.out.println("Break"); break; }

        if (space == -1){
          space = len;
          System.out.println("No more spaces. end is = " + space);
          done = true;
        }
        
        System.out.println("Found Space at: " + space);

        for(int j=space; j>0; j--){
          char c = curString.charAt(j-1);
          newString += c;
        }

        if(space != len){
          newString += ' ';
          curString = curString.substring(space+1, len);
          len = curString.length();
        }

      }

      // for(int i=len; i>0; i--){
      //   char c = str.charAt(i-1);
      //   if(c == ' '){
      //     //System.out.println("adding to newString" + curString);
      //     newString += (' ' + curString);
      //     curString = "";
      //   } else {
      //     //System.out.println("adding to curString" + c);
      //     curString += c;
      //   }
      // }
        return newString;

	}

	public static void main(String args[]){
	    String str = "Sun rises in the east";
	    System.out.println(reverseEachWord(str));
	}
}
