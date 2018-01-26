package Chapter7;

import java.util.Scanner;

/**
 * Program to average an array by using methods
 *
 * @author Maxwell Meckling
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int userArray[] = new int[input.nextInt()];
        System.out.println(userArray.length);
        enterElements(userArray);

        double average = averageElements(userArray);
        System.out.println("The average is: " + average);

        printArray(userArray);
    }

    /**
     * Method that allows the user to enter elements into the array
     *
     * @param x is an empty array to be filled with elements
     */
    public static void enterElements(int x[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + x.length + " elements: ");
        int stepper;
        for (int i = 0; i < x.length; i++) {
            stepper = input.nextInt();
            x[i] = stepper;

        }
    }

    /**
     * Method to average the elements in the array
     *
     * @param x is an integer array to be averaged
     * @return returns a double of the average value of all elements in the
     * array
     */
    public static double averageElements(int x[]) {
        int total = 0;

        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }

        return total / x.length;
    }

    /**
     * Method that prints all the elements in the array
     *
     * @param x is an integer array that holds the numbers to be printed
     */
    public static void printArray(int x[]) {
        System.out.print("The contents of the array: \n[");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
        System.out.print("\b]"); //Deletes the last, unrequired, comma in the output and adds a closing bracket
    }
}
