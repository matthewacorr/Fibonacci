public class Fibonacci {

    public static long fiboSeriesRec(int iterations){
        long startRecTime = System.nanoTime(); // Start timer for recursive method

        System.out.print("0 "); // Hardcode a 0 to rectify loop iteration issue

        // This loop calls the recursive method below and prints out the returned values
        for(int i = 1; i <= (iterations - 1); i++){
            System.out.print(fiboRecLoop(i) + " ");
        }

        long endRecTime = System.nanoTime(); // End timer for recursive method
        long recTime = endRecTime - startRecTime; // Calculate total time
        return recTime;
    }

    // This is the recursive method used by fiboSeriesRec
    // It returns each value of the fibonacci sequence
    public static long fiboRecLoop(int iterations){
        // If there is only one or two iterations left
        if(iterations == 1 || iterations == 2){
            return 1;
        }
        // Otherwise call the method again with the sum of the last two numbers
        return fiboRecLoop(iterations - 1) + fiboRecLoop(iterations - 2);
    }

    // This method uses a for loop to iteratively display the fibonacci sequence
    public static long fiboSeriesIte(int iterations){
        long n1=0, n2=1, n3;

        long startIteTime = System.nanoTime(); // Start timer for iterative method
        System.out.print(n1 + " "); // Print initial n1 value
        System.out.print(n2 + " "); // Print initial n2 value

        for(int i=2;i<iterations;i++){
            n3 = n1 + n2; // Create the next number in sequence with the sum of the previous two
            System.out.print(n3 + " "); // Print next number in fibonacci sequence
            n1 = n2; // Shift n1 value
            n2 = n3; // Shift n2 value
        }

        long endIteTime = System.nanoTime(); // End timer for iterative method
        long iteTime = endIteTime - startIteTime; // Calculate total time
        return iteTime;
    }

}
