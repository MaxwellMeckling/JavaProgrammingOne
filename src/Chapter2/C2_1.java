package Chapter2;

import java.util.Scanner;

/**
 * Program to convert from Celsius to Fahrenheit
 *
 * @author Maxwell Meckling
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner object to read from console
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        //grab celsius input from user
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        //calculate fahrenheit
        System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit"); //display fahrenheit

    }
}
