package assignment;

public class LoginValidator {
	private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "12345";

    /**
     * Validates username and password.
     * Returns true if both match the valid credentials.
     */
    public static boolean validateLogin(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}

