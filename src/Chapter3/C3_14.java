
package Chapter3;

import java.util.Scanner;

/**
 * Program to play a game of heads or tails with a computer
 * 
 * @author Maxwell Meckling
 */
public class C3_14 
{
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //scanner object to read from console
        
        int coinSide = (int)(Math.random() * 2); //randomly generate which side the coin is on
        System.out.println("---"+coinSide+"---");
        System.out.print("Welcome to HeadsOrTails, please guess 0 for head and 1 for tails: "); //prompt user
        int userGuess = input.nextInt(); //take user's input
        
        if(userGuess == coinSide) //Test for correct guess
            System.out.println("Congrats you guessed correctly"); //good guess
        else
            System.out.println("Sorry but you guessed wrong"); //bad guess
    }
}
