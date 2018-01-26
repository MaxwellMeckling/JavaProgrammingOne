package Chapter8;

/**
 * Program to display the hours an employee has worked in a table format and
 * sort them from greatest to least
 *
 * @author Maxwell Meckling
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] weeklyHours
                = {
                    {2, 4, 3, 4, 5, 8, 8},
                    {7, 3, 4, 3, 3, 4, 4},
                    {3, 3, 4, 3, 3, 2, 2},
                    {9, 3, 4, 7, 3, 4, 1},
                    {3, 5, 4, 3, 6, 3, 8},
                    {3, 4, 4, 6, 3, 4, 4},
                    {3, 7, 4, 8, 3, 8, 4},
                    {6, 3, 5, 9, 2, 7, 9}
                };
        int[][] total = printHours(weeklyHours);
        sortHours(total);
    }

    /**
     * Method to format a 2 dimensional array into a table of hours that an
     * employee has worked
     *
     * @param hours is the two dimensional array of employee weekly hours
     * @return returns the array, now sorted, back to the main method
     */
    public static int[][] printHours(int[][] hours) {
        System.out.print("                Su     M      T      W      Th     F      Sa     Total");

        int[][] total = {{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}, {0, 6}, {0, 7}};

        for (int i = 0; i < 8; i++) {
            System.out.print("\nEmployee " + i);
            for (int j = 0; j < 7; j++) {
                System.out.print("      " + hours[i][j]);
                total[i][0] += hours[i][j];
            }
            System.out.print("      " + total[i][0]);
        }
        return total;
    }

    /**
     * Method to calculate and display the employee hours from greatest to least
     *
     * @param total is the sorted employee weekly hours two dimensional array
     * passed to the method for calculations
     */
    public static void sortHours(int[][] total) {
        System.out.println("\nExtra Credit Output");

        int[][] bestArray = {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (total[j][0] > bestArray[i][0]) {
                    bestArray[i][0] = total[j][0];
                    bestArray[i][1] = total[j][1];
                }
            }
            total[bestArray[i][1]][0] = 0;
            System.out.println("Employee " + bestArray[i][1] + ": " + bestArray[i][0]);

        }
    }
}
