
package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the tip for a meal based on one's gratitude in percent
 * 
 * @author Maxwell Meckling
 */
public class C2_5 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //scanner object to read from console
        System.out.println("Enter the subtotal in dollars and gratuity rate in percent.");
        System.out.print("For example, 10 15: ");
        double subtotal = input.nextDouble() * 1.0; //Save the subtotal and gratuity rate variables
        double gratuityRate = input.nextDouble() * 0.01;
        double gratuity = gratuityRate * subtotal; //calculate the actual gratuity amount
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (gratuity + subtotal));
    }
}
