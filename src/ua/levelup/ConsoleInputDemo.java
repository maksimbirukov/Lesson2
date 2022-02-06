package ua.levelup;
//
import java.io.Console;
import java.util.Arrays;

public class ConsoleInputDemo {

    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
            System.err.println("No console");
            System.exit(1);
        }

        String login = console.readLine("Enter your login: ");
        char[] oldPassword = console.readPassword("Enter you old passwosd: ");
        if(verify(login, oldPassword)) {
            boolean noMatch;
            do {
                char [] newPassword1 = console.readPassword("Enter your new password: ");
                char [] newPassword2 = console.readPassword("Enter new password again: ");
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    console.format("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    console.format("Password for %s changed.%n", login);
                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }
    }

    private static void change(String login, char[] newPassword) {

    }

    private static boolean verify(String login, char[] oldPassword) {
        return true;
    }
}
