public class StudentAccount {
    private String username;
    private String password;

    public StudentAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validatePassword(String password) {
        if (password.length() < 8 || password.length() < 32) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            return false;
        }

        if (!password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{};:'\",.<>?/\\\\|`~].*")) {
            return false;
        }

        if (password.matches(".*[\\s].*")) {
            return false;
        }

        return true;
    }
}
