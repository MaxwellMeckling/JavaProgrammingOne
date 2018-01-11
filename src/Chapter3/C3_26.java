package Chapter3;

import java.util.Scanner;

/**
 * Program to determine if a number is divisible by 5 and 6 using different
 * logic operators
 *
 * @author Maxwell Meckling
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");

        int userInput = input.nextInt();

        if ((userInput % 6 == 0) && (userInput % 5) == 0) {
            System.out.println("Is " + userInput + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + userInput + " divisible by 5 and 6? false");
        }

        if ((userInput % 6 == 0) || (userInput % 5) == 0) {
            System.out.println("Is " + userInput + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + userInput + " divisible by 5 or 6? false");
        }

        if ((userInput % 6 == 0) ^ (userInput % 5) == 0) {
            System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? false");
        }
    }
}
