package Chapter7;

import java.util.Scanner;

/**
 * Program to calculate a minimum value in an array of 10 doubles
 *
 * @author Maxwell Meckling
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        min(numbers);

    }

    /**
     * Method
     *
     * @param numbers the array of doubles that is checked through for a minimum
     * value
     */
    public static void min(double[] numbers) {
        double best = numbers[0];

        for (int i = 0; i < 9; i++) {
            if (numbers[i + 1] < best) {
                best = numbers[i + 1];
            }
        }
        System.out.print("The minimum number is: " + best);
    }
}
