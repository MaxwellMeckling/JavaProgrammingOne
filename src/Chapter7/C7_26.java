package Chapter7;

import java.util.Scanner;

/**
 * Program to determine if two arrays are identical
 *
 * @author Maxwell Meckling
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        boolean check = compareArray(list1, list2);

        if (check == true) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Method to compare if two arrays are identical or not
     *
     * @param list1 the first list to be compared
     * @param list2 the second list to be compared
     * @return the boolean value of whether the lists are the identical or not
     */
    public static boolean compareArray(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        } else {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i]) {
                    return false;
                }
            }
            return true;
        }

    }
}
