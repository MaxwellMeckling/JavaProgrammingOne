
package Chapter1;

/**
 * Program to calculate the perimeter and area of a circle
 * 
 * @author Maxwell Meckling
 */
public class C1_8 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    
    public static void main(String[] args)
    {
        double pi = 3.14; //declarations
        double radius = 5.5;
        double perimeter = (2 * radius * pi); //calculations
        double area = (radius * radius * pi);
        System.out.println("The perimeter is " + perimeter); //displays
        System.out.println("The area is " + area);

    }
}
