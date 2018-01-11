
package Chapter3;

import java.util.Scanner;

/**
 * Program to determine math information about two numbers and then determine a grade from them
 * 
 * @author Maxwell Meckling
 */
public class P3 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double x;
        double y;
        
        System.out.print("Please enter your first number: ");
        x = input.nextDouble();
                
        System.out.print("Please enter your second number: ");
        y = input.nextDouble();
        
        
        if(x < y)//Less than
            System.out.println("The first number is less than the second");
        
        if(x > y)//Greater than
            System.out.println("The first number is greater than the second");
        
        if(x == y)//Equal to
            System.out.println("The first number is equal to the second");
        
        if(x <= y)//Less than or equal to
            System.out.println("The first number is less than or equal to the second"); 
        
        if(x != y)// Not equal to
            System.out.println("The first number is not equal to the second");
        
        if(y == 0)//Fractions and dividing by zero
            System.out.println("Cannot divide by zero"); 
        else if(x / y < 1)
            System.out.println("proper fraction");
        else
            System.out.println("improper fraction");
        
        if(x >= 90)//Grading process
            System.out.println("A");
        else if( x >= 80)
                System.out.println("B");
        else if( x >= 80)
                System.out.println("C");
        else if( x >= 70)
                System.out.println("D");
            else
            System.out.println("F");
        
        if((y >= 1) && (y <= 100))//In range or out of range
            System.out.println("In range");
        else
            System.out.println("Out of  range");
    }
}
