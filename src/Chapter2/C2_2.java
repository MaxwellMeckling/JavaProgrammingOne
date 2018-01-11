package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the area and volume of a cylinder
 *
 * @author Maxwell Meckling
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner to read user input
        System.out.println("Enter the radius and length of a cylinder. ");
        System.out.print("For example, 5.5 12: "); //Take user input for radius and length
        double radius = input.nextDouble(); //Save the radius and length variables
        double length = input.nextDouble();
        double area = radius * radius * 3.1415; //Calculate area
        double volume = area * length; //Calculate volume
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
