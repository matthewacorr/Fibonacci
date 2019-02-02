/*
    Name: Matthew Corr (0626013)
    Date: Feb 3rd 2019

    This program was made for COIS2240, it compares two the speeds of different iterative/recursive methods
 */
import java.util.Scanner; // Import Scanner to read lines

public class Main {

    public static void main(String[] args) {

        // Create the scanner
        Scanner in = new Scanner(System.in);

        // Welcome the user
        System.out.println(" _______ __ __                                 __ ");
        System.out.println("|    ___|__|  |__._____._____.___._.____.____.|__|");
        System.out.println("|    ___|  |  _  |  _  |     |  _  |  __|  __||  |");
        System.out.println("|___|   |__|_____|_____|__|__|___._|____|____||__|");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|            Please enter the amount of iterations to perform            |");
        System.out.println("-------------------------------------------------------------------------");

        // Take in the amount of elements to print
        System.out.print("> ");
        int elements = in.nextInt();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Calculating for " + elements + " iterations.");
        System.out.println("------------------------------------------------------------------------");
        // Testing methods
        System.out.print("Testing iterative method: ");
        long iteTime = Fibonacci.fiboSeriesIte(elements);

        System.out.print("\nTesting recursive method: ");
        long recTime = Fibonacci.fiboSeriesRec(elements);

        // Print out time stamps
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("Time taken for iterative method: " + iteTime + " nanoseconds / " + (iteTime/1000000) + " milliseconds");
        System.out.println("Time taken for recursive method: " + recTime + " nanoseconds / " + (recTime/1000000) + " milliseconds");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Thanks for playing, goodbye!");
        System.out.println("------------------------------------------------------------------------");
        System.exit(0);
    }
}
