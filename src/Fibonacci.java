public class Fibonacci {

    public static long fiboSeriesRec(int elements){
        long startRecTime = System.nanoTime(); // Start timer for recursive method

        System.out.print("0 "); // Hardcoded 0
        for(int i = 1; i <= elements; i++){
            System.out.print(fiboRecLoop(i) +" ");
        }

        long endRecTime = System.nanoTime(); // End timer for recursive method
        long recTime = endRecTime - startRecTime; // Calculate total time
        return recTime;
    }

    public static long fiboRecLoop(int elements){
        if(elements == 1 || elements == 2){
            return 1;
        }

        return fiboRecLoop(elements - 1) + fiboRecLoop(elements - 2);
    }

    public static long fiboSeriesIte(int elements){
        long n1=0, n2=1, n3;

        long startIteTime = System.nanoTime(); // Start timer for iterative method
        System.out.print(n1 + " "); // Print initial n1 value
        System.out.print(n2 + " "); // Print initial n2 value

        for(int i=2;i<elements;i++){
            n3 = n1 + n2;
            System.out.print(n3 + " "); // Print sum of last two numbers
            n1 = n2; // Shift n1 value
            n2 = n3; // Shift n2 value
        }

        long endIteTime = System.nanoTime(); // End timer for iterative method
        long iteTime = endIteTime - startIteTime; // Calculate total time
        return iteTime;
    }

}
