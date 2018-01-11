package Chapter4;

import java.util.Scanner;

/**
 * Program to determine which of two bidders has a better bid based on their
 * inputed information
 *
 * @author Maxwell Meckling
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First bidder, please enter your name: "); //Bidder one info
        String bidder1Name = input.next();
        System.out.print("\n How many hours of work will you require: ");
        int bidder1Hours = input.nextInt();
        System.out.print("\n How much do you charge per hour: ");
        double bidder1Wage = input.nextDouble();

        System.out.print("\nNow, second bidder, please enter your name: "); //Bidder two info
        String bidder2Name = input.next();
        System.out.print("\n How many hours of work will you require: ");
        int bidder2Hours = input.nextInt();
        System.out.print("\n How much do you charge per hour: ");
        double bidder2Wage = input.nextDouble();

        double bidder1Cost = bidder1Hours * bidder1Wage; //Bidder one's cost
        double bidder2Cost = bidder2Hours * bidder2Wage; //Bidder two's cost

        if (bidder1Cost < bidder2Cost) {
            System.out.printf("\nThe winner is %s with a total cost of $%.2f", bidder1Name, bidder1Cost);
        } else if (bidder2Cost < bidder1Cost) {
            System.out.printf("\nThe winner is %s with a toal cost of $%.2f", bidder2Name, bidder2Cost);
        } else if ((bidder1Cost == bidder2Cost) && (bidder1Hours < bidder2Hours)) {
            System.out.printf("\nThe winner is %s with a total cost of $%.2f and an estimated time of %d hours", bidder1Name, bidder1Cost, bidder1Hours);
        } else if ((bidder1Cost == bidder2Cost) && (bidder1Hours > bidder2Hours)) {
            System.out.printf("\nThe winner is %s with a total cost of $%.2f and an estimated time of %d hours", bidder2Name, bidder2Cost, bidder2Hours);
        } else {
            System.out.printf("%s and %s have identical bids: \n", bidder1Name, bidder2Name);
            System.out.printf("%s has a estimated time of %d, a cost per hour of $%.2f, and a total cost of $%.2f", bidder1Name, bidder1Hours, bidder1Wage, bidder1Cost);
            System.out.printf("\n%s has a estimated time of %d, a cost per hour of $%.2f, and a total cost of $%.2f", bidder2Name, bidder2Hours, bidder2Wage, bidder2Cost);
        }
    }
}
