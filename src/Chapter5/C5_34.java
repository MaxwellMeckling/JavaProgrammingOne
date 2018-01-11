package Chapter5;

import java.util.Scanner;

/**
 * Program to play to rock paper scissors with a user and computer.
 *
 * @author Maxwell Meckling
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerInput, userInput;

        int userScore = 0, computerScore = 0; //Variables for the while loop
        while (userScore < 2 && computerScore < 2) {

            System.out.print("Scissor (0), rock (1), paper (2): ");
            userInput = input.nextInt(); //Saves user input

            computerInput = (int) (Math.random() * 3); //Creates random int between 0 and 2

            if (computerInput == 1 && userInput == 0) //computer rock win
            {
                System.out.print("The computer is rock. You are scissor. You lost");
                computerScore++;
            } else if (computerInput == 2 && userInput == 1) //computer paper win
            {
                System.out.print("The computer is paper. You are rock. You lost");
                computerScore++;
            } else if (computerInput == 1 && userInput == 0) //computer scissor win
            {
                System.out.print("The computer is scissor. You are paper. You lost");
                computerScore++;
            } else if (computerInput == userInput) //draw
            {
                if (userInput == 0) {
                    System.out.print("The computer is scissor. You are scissor. It is a draw");
                } else if (userInput == 1) {
                    System.out.print("The computer is rock. You are rock. It is a draw");
                } else {
                    System.out.print("The computer is paper. You are paper. It is a draw");
                }
            } else if (userInput == 1 && computerInput == 0) //user rock win
            {
                System.out.print("The computer is scissor. You are rock. You won");
                userScore++;
            } else if (userInput == 2 && computerInput == 1) //user paper win
            {
                System.out.print("The computer is rock. You are paper. You won");
                userScore++;
            } else //user scissor win
            {
                System.out.print("The computer is paper. You are scissor. You won");
                userScore++;
            }
            System.out.println();
        } //exit loop

        if (userScore > computerScore) {
            System.out.println("You won more than two times");
        } else {
            System.out.println("The computer won more than two times");
        }

    }
}
