public class LoginApp {
    private static final String VALID_USERNAME = "sherlin";
    private static final String VALID_PASSWORD = "12345";

    public static boolean login(String username, String password) {
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

    public static void main(String[] args) {
        boolean successfulLogin = login("sherlin", "12345");
        System.out.println("Login successful: " + successfulLogin);
    }
}
