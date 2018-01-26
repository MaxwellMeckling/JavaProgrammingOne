package Chapter7;

import java.util.Scanner;

/**
 * Program to enter and calculate student scores on a grading scale
 *
 * @author Maxwell Meckling
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int[] studentScores = new int[input.nextInt()];

        System.out.print("Enter the " + studentScores.length + " scores: ");
        for (int i = 0; i < studentScores.length; i++) {
            studentScores[i] = input.nextInt();
        }

        char[] grades = new char[studentScores.length];

        grading(grades, studentScores);

        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Student " + (i + 1) + "'s score is " + studentScores[i] + " and grade is " + grades[i]);
        }

    }

    /**
     * Method used to determine the letter grade each student gets based on
     * their grade
     *
     * @param grades the character array that stores the student's grades
     * @param scores the integer array that stores the students scores
     */
    public static void grading(char[] grades, int[] scores) {
        int best = 0;

        for (int i = 0; i < (grades.length - 1); i++) {
            if (scores[i] < scores[i + 1]) {
                best = i;
            } else {
                best = scores[i];
            }
        }

        for (int i = 0; i < grades.length; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
