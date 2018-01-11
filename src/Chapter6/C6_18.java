package Chapter6;

import java.util.Scanner;

/**
 * Program to accept and validate a password entered by the user
 *
 * @author Maxwell Meckling
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String userInput = input.next();

        validatePassword(userInput);
    }

    /**
     * A method to validate a passed password
     *
     * @param password the password that the method is validating
     * @return the boolean value if the password is valid or not
     */
    public static boolean validatePassword(String password) {
        if (password.length() >= 8) {
            for (int x = 0; x < password.length(); x++) {
                if (!(Character.isLetterOrDigit(password.charAt(x)))) {
                    System.out.println("A password must consist of only letters and digits \nInvalid Password");
                    return false;
                }
            }
            int counter = 0;
            for (int x = 0; x < password.length(); x++) {
                if (Character.isDigit(password.charAt(x))) {
                    counter++;
                    if (counter == 2) {
                        System.out.println("Valid Password");
                        return true;
                    }
                }
            }
            System.out.println("A password must contain at least two digits \nInvalid Password");
            return false;
        }
        System.out.println("A password must have at least eight characters \nInvalid Password");
        return false;
    }
}
