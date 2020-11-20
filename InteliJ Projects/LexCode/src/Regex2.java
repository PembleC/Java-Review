import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Tester14 {

    public static boolean checkWebAddressValidity(String webAddress) {
        //Implement your code here and change the return value accordingly

        String start = "(http)";
        String second = "(s?)(://)";
        String www = "(www.)?";
        String alphanum = "[0-9]*[a-Z]*[0-9]*[a-Z]*";
        String end = "(.com)|(.org)|(.net)";

        String pattern = "(http)(s?)(://)(www.)?[A-Z]*[0-9]*[a-z]*[A-Z]*[0-9]*[a-z]*((.com)|(.org)|(.net))";
        //String pattern2 = "(https://www.)?[0-9]*[a-z]*[0-9]*[a-z]*[0-9]*((.com)|(.org)|(.net))";

        if(webAddress.matches(pattern)){
            return true;
        } else { return false; }
    }

    public static void main(String[] args) {

        //Change the value of webAddress for testing your code with different web addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
