import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import sun.security.util.Password;
//import sun.security.util.Password;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    /**checks if the password is too long**/
    @Test
    @DisplayName("Check PasswordLength")
    public void PasswordLong(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkpasswordLength("dslfjaslkdfjlaksdjflksadjfklsajk"));
    }
    /**checks if the password is too short**/
    @Test
    @DisplayName("Check PasswordLength 2")
    public void PasswordShort(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkpasswordLength("sdjk"));
    }
    /** checks if the number has upper and lower **/
    @Test
    @DisplayName("Upper/Lower")
    public void UpperandLower() {
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkupperlower("abcdefghijkl"));
    }
    /** checks if the number has upper and lower **/
    @Test
    @DisplayName("Upper/Lower 2")
    public void UpperandLower2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.checkupperlower("Password"));
    }
    /** checks if the password has a Number **/
    @Test
    @DisplayName("Password has Number")
    public void hasNumber() {
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.hasNum("ABcdefghijkl"));
    }
    /** checks if the password has a Number **/
    @Test
    @DisplayName("Password has Number 2")
    public void hasNumber2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.hasNum("Password12"));
    }
    /** checks if it has a special character **/
    @Test
    @DisplayName("Special Character")
    public void specialchar(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.checkspecialchar("Password"));
    }
    @Test
    @DisplayName("Special Character 2")
    public void specialchar2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.checkspecialchar("Passw@rd"));
    }
    /** checks if the next numbers are ongoing **/
    @Test
    @DisplayName("ongoing Numbers")
    public void nextNumber(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.nextNum("Password123"));
    }
    @Test
    @DisplayName("ongoing Numbers 2")
    public void nextNumber2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.nextNum("Password12"));
    }
    /** checks if the next numbers are the same **/
    @Test
    @DisplayName("Same Next Numbers")
    public void samenextNumber(){
        PasswordTest pw = new PasswordTest();
        assertFalse(pw.samenextNum("Password1111"));
    }
    @Test
    @DisplayName("Same Next Numbers 2")
    public void samenextNumber2() {
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.samenextNum("Password111"));
    }
    /** final test **/
    @Test
    @DisplayName("Final Test")
    public void finalTest(){
        PasswordTest pw = new PasswordTest();
        assertTrue(pw.checkpassword("Passw@rd12"));
    }
}

