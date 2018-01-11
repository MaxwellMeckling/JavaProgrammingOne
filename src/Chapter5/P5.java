package Chapter5;

import java.util.Scanner;

/**
 * Program for polling, or counting votes.
 *
 * @author Maxwell Meckling
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yes = 0, no = 0, invalid = 0;
        String userInput = "";

        while (userInput != "q") {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting: ");
            userInput = input.next().toLowerCase();

            if (userInput.equals("y")) {
                yes++;
            } else if (userInput.equals("n")) {
                no++;
            } else if (userInput.equals("q")) {
                break;
            } else {
                invalid++;
                System.out.print("INVALID CODE:");
            }

        }
        System.out.println("\nYes Votes:       " + yes);
        System.out.println("No Votes:        " + no);
        System.out.println("Invalid Votes:   " + invalid);
        System.out.println("No Votes:        " + (yes + no + invalid));
    }
}
