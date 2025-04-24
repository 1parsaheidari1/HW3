import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;


public class StudentAccount {
    private String username;
    private String password;

    public StudentAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void validatePassword(String password) {
        if (password.length() < 8 || password.length() < 32) {
            System.out.println("The password is invalid.");
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("The password is invalid.");
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("The password is invalid.");
        }

        if (!password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{};:'\",.<>?/\\\\|`~].*")) {
            System.out.println("The password is invalid.");
        }

        if (password.matches(".*[\\s].*")) {
            System.out.println("The password is invalid.");
        }

        System.out.println("The password is valid.");
    }
}
