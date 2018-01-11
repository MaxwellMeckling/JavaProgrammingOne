
package Chapter3;

import java.util.Scanner;

/**
 * Program compare weight and price of two packages to determine the better price
 * 
 * @author Maxwell Meckling
 */
public class C3_33 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
        public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);   
        
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextInt();
        double price1 = input.nextDouble();
        
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextInt();
        double price2 = input.nextDouble();
        
        
        if((weight1 / price1) > (weight2 / price2))
        {
            System.out.println("Package 1 has a better price");
        }
        else if((weight1 / price1) == (weight2 / price2))
                System.out.println("Both packages have the same price");
             else
                System.out.println("Package 2 has a better price");
    }
}
