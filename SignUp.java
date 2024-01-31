import java.util.Scanner;
import java.util.regex.Pattern;

public class SignUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the sign up page!");

        System.out.print("Enter your desired username: ");
        String username = input.nextLine();

        if (isUsernameTaken(username)) {
            System.out.println("Error: This username is already taken. Please choose a different one.");
            return;
        }


        String password;
        do {
            System.out.print("Enter your password (must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit): ");
            password = input.nextLine();
        } while (!isValidPassword(username, password));


        String email;
        do {
            System.out.print("Enter your email address: ");
            email = input.nextLine();
        } while (!isValidEmail(email));

        System.out.println("Congratulations! Your account has been created successfully.");
    }

    private static boolean isUsernameTaken(String username) {

        return username.equals("exampleUser");
    }

    private static boolean isValidPassword(String username, String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?!.*" + Pattern.quote(username) + ").{8,}$";
        if (!password.matches(regex)) {
            System.out.println("Error: Password must be at least 8 characters long and contain at least one uppercase letter," +
                    " one lowercase letter, and one digit. It cannot exactly match the username.");
            return false;
        }
        return true;
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!email.matches(regex)) {
            System.out.println("Error: Invalid email format. Please enter a valid email address.");
            return false;
        }
        return true;
    }
}
