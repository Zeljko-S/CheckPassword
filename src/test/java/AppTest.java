import org.junit.jupiter.api.Test;
//import sun.security.util.Password;
//import sun.security.util.Password;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /**checks if the password is too long**/
    @Test
    public void PasswordLong(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkpasswordLength("dslfjaslkdfjlaksdjflksadjfklsajk"));
    }
    /**checks if the password is too short**/
    @Test
    public void PasswordShort(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkpasswordLength("sdjk"));
    }
    /** checks if the number has upper and lower **/
    @Test
    public void UpperandLower() {
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkupperlower("abcdefghijkl"));
    }
    /** checks if the number has upper and lower **/
    @Test
    public void UpperandLower2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.checkupperlower("Password"));
    }
    /** checks if the password has a Number **/
    @Test
    public void hasNumber() {
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.hasNum("ABcdefghijkl"));
        assertTrue(pw.hasNum("Password12"));
    }
    /** checks if the next numbers are ongoing **/
    @Test
    public void nextNumber(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.nextNum("Password123"));
        assertTrue(pw.nextNum("Password12"));
    }
    /** checks if the next numbers are the same **/
    @Test
    public void samenextNumber(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.samenextNum("Password1111"));
        assertTrue(pw.samenextNum("Password111"));
    }
    /** checks if it has a special character **/
    @Test
    public void specialchar(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkspecialchar("Password"));
        assertTrue(pw.checkspecialchar("Passw@rd"));
    }
    /** final test **/
    @Test
    public void finalTest(){
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.checkpassword("Passw@rd12"));
    }
}

