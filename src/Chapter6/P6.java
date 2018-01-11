package Chapter6;

import java.util.Scanner;

/**
 * Program to calculate currency exchange rates for euros, pounds, yen, or
 * dollars
 *
 * @author Maxwell Meckling
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euros, pounds, yen, dollars;

        System.out.print("How many Euros does a dollar buy? ");
        euros = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        pounds = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        yen = input.nextDouble();

        String check = "yes"; // For logic later in a nested loop
        String selectedCurrency;

        while (!(check.equals("no"))) {
            System.out.print("\nHow many dollars do you want to convert: $");
            dollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds, or \"Y\" to buy Yen: ");
            selectedCurrency = input.next().toUpperCase();

            if (selectedCurrency.equals("E")) {
                moneyConverter(dollars, euros, "Euros");
            } else if (selectedCurrency.equals("P")) {
                moneyConverter(dollars, pounds, "Pounds Sterlings");
            } else {
                moneyConverter(dollars, yen, "Yen");
            }

            System.out.print("\nAre there anymore conversions to perform? ");
            check = input.next().toLowerCase();
            if (check.equals("yes")) {
                continue;
            } else if (check.equals("no")) {
                break;
            } else {
                while (true) {
                    System.out.print("\nEnter \"yes\" to continue or \"no\" to stop: ");
                    check = input.next().toLowerCase();

                    if (check.equals("yes") || check.equals("no")) {
                        break;
                    }
                }
            }
        }
    }

    /**
     * Method to convert dollars to another currency, including tax, depending
     * on user input
     *
     * @param dollars The amount of dollars we want to convert
     * @param exchangeRate The exchange rate of the currency we're converting to
     * @param currencyName The name of the currency we're converting to
     */
    public static void moneyConverter(double dollars, double exchangeRate, String currencyName) {
        double currency = dollars * exchangeRate;

        if (dollars >= 100) {
            currency *= .95;
        } else {
            currency *= .90;
        }

        System.out.printf("For %.2f dollars, you will be able to buy %.2f %s", dollars, currency, currencyName);
    }
}
