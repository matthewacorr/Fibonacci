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

        // Testing methods
        System.out.print("\nTesting iterative method:");
        long startIteTime = System.nanoTime(); // Start timer for iterative method
        Fibonacci.fiboSeriesIte(elements);
        long endIteTime = System.nanoTime(); // End timer for iterative method
        long iteTime = endIteTime - startIteTime;

        System.out.print("Testing recursive method:");
        long startRecTime = System.nanoTime(); // Start timer for recursive method
        Fibonacci.fiboSeriesRec(elements);
        long endRecTime = System.nanoTime(); // End timer for recursive method
        long recTime = endRecTime - startRecTime;

        // Print out time stamps
        System.out.println("Time for iterative method: " + iteTime);
        System.out.println("Time for recursive method: " + recTime);
    }
}
