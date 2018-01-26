package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to display a chart of salesman and the days they sell things
 *
 * @author Nick Gonzalez
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[][] sales = new double[4][5];
        Scanner in = new Scanner(System.in);
        int temp1, temp2;
        while (true) {
            System.out.print("Enter the salesman ID as A, B, C, or D: ");
            temp1 = arrSearch(sales, in.next());
            if (temp1 == -1) {
                System.out.println("Invalid entry");
                continue;
            }
            System.out.print("Enter the day as M, T, W, H, or F: ");
            temp2 = arrSearch(sales, in.next());
            if (temp2 == -1) {
                System.out.println("Invalid entry");
                continue;
            }
            System.out.print("Enter the amount of the sale: ");
            sales[temp1][temp2] = in.nextDouble();
            System.out.print("More data? Enter N to stop or anything else to continue: ");
            if (in.next().equalsIgnoreCase("N")) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("  M    T    W    H    F");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(Arrays.toString(sales[i]));
        }
    }

    /**
     * Method to search the array for the correct day
     *
     * @param arr array to search
     * @param s string to search for
     * @return returns the position of the array
     */
    public static int arrSearch(double[][] arr, String s) {
        if (s.equalsIgnoreCase("A")) {
            return 0;
        } else if (s.equalsIgnoreCase("B")) {
            return 1;
        } else if (s.equalsIgnoreCase("C")) {
            return 2;
        } else if (s.equalsIgnoreCase("D")) {
            return 3;
        } else if (s.equalsIgnoreCase("M")) {
            return 0;
        } else if (s.equalsIgnoreCase("T")) {
            return 1;
        } else if (s.equalsIgnoreCase("W")) {
            return 2;
        } else if (s.equalsIgnoreCase("H")) {
            return 3;
        } else if (s.equalsIgnoreCase("F")) {
            return 4;
        } else {
            return -1;
        }
    }
}
