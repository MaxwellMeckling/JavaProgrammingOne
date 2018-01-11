package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total cost for one's dinner
 *
 * @author Maxwell Meckling
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner object to read from console

        System.out.println("Hello and welcome to the dinner calculator.");
        System.out.println("Please enter the price of your meal, drink, and dessert. In that order");
        System.out.print("For example, 4.5 1 5.75: ");

        float meal = input.nextFloat();
        float drink = input.nextFloat();
        float dessert = input.nextFloat(); // Collect user input

        float foodPrice = meal + drink + dessert; // Calculate the food price, tax, and tip
        float tax = foodPrice * .1f;
        float tip = foodPrice * .15f;

        double totalPrice = foodPrice + tax + tip; // Calculate the total price for dinner

        System.out.println(); // Spacing for neatness
        System.out.println("Overall, your food cost $" + foodPrice + ","); //Tell the user all the info they need about their meal
        System.out.println("your tax will be $" + tax + ",");
        System.out.println("and your tip should be $" + tip);
        System.out.println(); // Spacing for neatness
        System.out.println("That brings your total to $" + totalPrice);
    }
}
