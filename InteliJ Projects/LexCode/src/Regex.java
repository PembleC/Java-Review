class Testeras {

    public static boolean checkPasswordValidity(String password) {
        //Implement your code here and change the return value accordingly
        if(password.length() < 8 || password.length() > 20){
            return false;
        } else {
            String specialChar = "[!@#$%&*_]+";
            String upper = "[A-Z]+";
            String lower = "[a-z]+";
            String num = "[0-9]+";
            String any = ".*";
            String regex = any + upper + any;
            if(password.matches(regex)){
                String regex2 = any + specialChar + any;
                if(password.matches(regex2)){
                    String regex3 = any + lower + any;
                    if(password.matches(regex3)){
                        String regex4 = any + num + any;
                        if(password.matches(regex4)){
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        //Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }

}
