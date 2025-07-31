package assignment;

public class LoginValidatorTest {
	public static void main(String[] args) {
        // Test cases:
        testLogin("admin", "12345", true, "Valid username and password");
        testLogin("", "12345", false, "Empty username");
        testLogin("admin", "", false, "Empty password");
        testLogin(null, "12345", false, "Null username");
        testLogin("admin", null, false, "Null password");
        testLogin(null,null, false, "Null username and password");
        testLogin("user", "password", false, "Invalid username and password");
        testLogin("admin", "wrongpass", false, "Valid username, wrong password");
        testLogin("wronguser", "12345", false, "Wrong username, valid password");

        System.out.println("All tests completed.");
    }

    private static void testLogin(String username, String password, boolean expected, String testDescription) {
        boolean result = LoginValidator.validateLogin(username, password);
        if (result == expected) {
            System.out.println("PASSED: " + testDescription);
        } else {
            System.out.println("FAILED: " + testDescription + " - Expected " + expected + " but got " + result);
        }
    }

}
