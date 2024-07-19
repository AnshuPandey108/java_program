import java.io.*;

public class Console1 {
    public static void main(String[] args) {
        String str;
        char[] ch;
        Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }

        System.out.println("Enter Username: ");
        str = console.readLine();

        System.out.println("Enter Password: ");
        ch = console.readPassword();

        System.out.println("Username: " + str);
        // Convert char array to String before printing
        System.out.println("Password: " + new String(ch));
    }
}
