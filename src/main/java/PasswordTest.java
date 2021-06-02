import java.lang.*;


public class PasswordTest {

    public boolean checkpassword(String password) {                     //final Test
        return checkpasswordLength(password) && checkupperlower(password) && hasNum(password) && checkspecialchar(password) && nextNum(password) && samenextNum(password);
    }

    public boolean checkpasswordLength(String password) {               //Test 1
        if (!(password.length() >= 8 && password.length() <= 25)) {
            return false;
        }
        return true;
    }
    public boolean checkupperlower(String password) {                   //Test 2

        int upper = 0;
        int lower = 0;

        for (char i : password.toCharArray()) {
            if (Character.isUpperCase(i)) {
                upper += 1;
            } else if (Character.isLowerCase(i)) {
                lower += 1;
            }
        }
        return lower != 0 && upper != 0;
    }
    public boolean hasNum(String password) {                            //Test 3

        int num = 0;

        for (int i : password.toCharArray()) {
            if (Character.isDigit(i)) {
                num += 1;
            }
        }
        return num != 0;
    }
    public boolean checkspecialchar(String password) {                  //Test 4

        char[] c = {'(', ')', '#', '$', '?', '!', '%', '/', '@'};

        for(int i = 0; i < password.length(); i++){
            for(char special : c) {
                if(password.charAt(i) == special){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean nextNum(String password) {                           //Test 5

        int firstdigit = 0;
        int seconddigit = 0;
        int thirddigit = 0;

        for (int i = 0; i <= password.length(); i++) {
            if (i < password.length()-2 && Character.isDigit(password.charAt(i)) && Character.isDigit(password.charAt(i+1)) && Character.isDigit(password.charAt(i+2))){
                firstdigit = password.charAt(i);
                seconddigit = password.charAt(i+1);
                thirddigit = password.charAt(i+2);
            }
        }
        return firstdigit != seconddigit - 1 || firstdigit != thirddigit - 2;
    }
    public boolean samenextNum(String password) {                      //Test 6

        int firstdigit = 0;
        int seconddigit = 0;
        int thirddigit = 0;
        int fourthdigit = 0;

        for (int i = 0; i <= password.length(); i++) {
            if (i < password.length()-3 && Character.isDigit(password.charAt(i)) && Character.isDigit(password.charAt(i+1)) &&
                    Character.isDigit(password.charAt(i+2)) && Character.isDigit(password.charAt(i+3))){

                firstdigit = password.charAt(i);
                seconddigit = password.charAt(i+1);
                thirddigit = password.charAt(i+2);
                fourthdigit = password.charAt(i+3);

                if (firstdigit == seconddigit && firstdigit == thirddigit && firstdigit == fourthdigit) {
                    return false;
                }
            }
        }
        return true;
    }
}

