
package Chapter4;

import java.util.Scanner;

/**
 * Program to determine the amount of financial aid a student can receive based on their payroll
 * 
 * @author Maxwell Meckling
 */
public class C4_23 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee's name: "); //Name
        String name = input.next();
        
        System.out.print("Enter number of hours worked in a week: "); //hours worked
        double hours = input.nextDouble();
        
        System.out.print("Enter hourly pay rate: "); //hourly pay rate
        double hourlyRate = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: "); //federal tax stuff
        double federalTax = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: "); //state tax stuff
        double stateTax = input.nextDouble();
        
        
        System.out.print("\nEmployee Name: " + name);
        System.out.printf("\nHours Worked: %.2f", hours);
        System.out.printf("\nPay Rate: $%.2f" , hourlyRate);
        System.out.printf("\nGross Pay: $%.2f" , (hours * hourlyRate)); //gross pay
        
        System.out.print("\nDeductions:");
        System.out.printf("\n   Federal Withholding (%.2f%%): $%.2f" , (federalTax * 100), (federalTax * (hours * hourlyRate))); //federal withholding = federalTax * Gross Pay
        System.out.printf("\n   State Withholding (%.2f%%): $%.2f" , (stateTax * 100), (stateTax * (hours * hourlyRate))); //state withholding = stateTax * Gross Pay
        System.out.printf("\n   Total Deduction: $%.2f" , ((federalTax * (hours * hourlyRate)) + (stateTax * (hours * hourlyRate)))); //total decuction = federal withholidng + state withholding
        
        System.out.printf("\nNet Pay: $%.2f" , ((hours * hourlyRate) - ((federalTax * (hours * hourlyRate)) + (stateTax * (hours * hourlyRate)))));
    }
}
