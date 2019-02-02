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
        System.out.println("Welcome to the Fibonacci tester!");
        System.out.println("Please enter the number of elements to test");
        System.out.println("--------------------------------------------");

        // Take in the amount of elements to print
        System.out.print("> ");
        int elements = in.nextInt();

        System.out.println("\nCalculating for " + elements + " iterations.");
        // Testing methods
        System.out.print("Testing iterative method:");
        long iteTime = Fibonacci.fiboSeriesIte(elements);

        //System.out.print("Testing recursive method:");
        //long recTime = Fibonacci.fiboSeriesRec(elements);

        // Print out time stamps
        System.out.println("\nTime taken for iterative method: " + iteTime + " nanoseconds");
        //System.out.println("Time taken for recursive method: " + recTime + " nanoseconds);
    }
}
