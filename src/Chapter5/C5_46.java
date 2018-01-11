package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse the order of a string and display it
 *
 * @author Maxwell Meckling
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine(), reverse = "";

        for (int x = userInput.length() - 1; x >= 0; x--) {
            reverse += userInput.charAt(x);
        }

        System.out.println("The reversed string is " + reverse);
    }
}
