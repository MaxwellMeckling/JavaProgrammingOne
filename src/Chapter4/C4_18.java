package Chapter4;

import java.util.Scanner;

/**
 * Program to determine which year and major a student is taking based off of
 * two characters
 *
 * @author Maxwell Meckling
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");

        String userInput = input.next().toUpperCase();
        char major = userInput.charAt(0);
        char year = userInput.charAt(1);

        if (major == 77 || major == 73 || major == 64) {
            if (year == 49 || year == 50 || year == 51 || year == 52) {
                switch (major) {
                    case 77:
                        System.out.print("Mathematics ");
                        break;
                    case 67:
                        System.out.print("Computer Science ");
                        break;
                    default:
                        System.out.print("Information Technology ");
                }

                switch (year) {
                    case 49:
                        System.out.print("Freshman");
                        break;
                    case 50:
                        System.out.print("Sophomore");
                        break;
                    case 51:
                        System.out.print("Junior");
                        break;
                    default:
                        System.out.print("Senior");
                }
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
