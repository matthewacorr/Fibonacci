/*
    Name: Matthew Corr (0626013)
    Date: Feb 3rd 2019

    This program was made for COIS2240, it compares two the speeds of different iterative/recursive methods
 */
import java.util.Scanner; // Import Scanner to read lines

public class Main {

    public static void main(String[] args) {

        // Create the scanner for user input
        Scanner in = new Scanner(System.in);

        // Welcome the user
        System.out.println(" _______ __ __                                 __ ");
        System.out.println("|    ___|__|  |__._____._____.___._.____.____.|__|");
        System.out.println("|    ___|  |  _  |  _  |     |  _  |  __|  __||  |");
        System.out.println("|___|   |__|_____|_____|__|__|___._|____|____||__|");
        System.out.println("-------------------------------------------------------------");
        System.out.println("|      Please enter the amount of iterations to perform     |");
        System.out.println("-------------------------------------------------------------");

        // Read the amount of iterations to perform
        System.out.print("> ");
        int iterations = in.nextInt();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Calculating for " + iterations + " iterations.");
        System.out.println("-------------------------------------------------------------");

        // Call the iterative method
        System.out.print("Testing iterative method: ");
        long iteTime = Fibonacci.fiboSeriesIte(iterations); // Receive time taken in nanoseconds

        // Call the recursive method
        System.out.print("\nTesting recursive method: ");
        long recTime = Fibonacci.fiboSeriesRec(iterations); // Receive time taken in nanoseconds

        // Print out time stamps in both nanoseconds and milliseconds
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Time taken for iterative method: " + iteTime + " nanoseconds / " + (iteTime/1000000) + " milliseconds");
        System.out.println("Time taken for recursive method: " + recTime + " nanoseconds / " + (recTime/1000000) + " milliseconds");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Thanks for playing, goodbye!");
        System.out.println("-------------------------------------------------------------");
        System.exit(0);
    }
}
