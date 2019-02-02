public class Fibonacci {

    public static long fiboSeriesRec(int elements){
        long startRecTime = System.nanoTime(); // Start timer for recursive method
        // Recursive loop goes here
        long endRecTime = System.nanoTime(); // End timer for recursive method
        long recTime = endRecTime - startRecTime; // Calculate total time
        return recTime;
    }

    public static long fiboSeriesIte(int elements){
        long n1=0, n2=1, n3;

        long startIteTime = System.nanoTime(); // Start timer for iterative method
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for(int i=2;i<elements;i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        long endIteTime = System.nanoTime(); // End timer for iterative method
        long iteTime = endIteTime - startIteTime; // Calculate total time
        return iteTime;
    }

}
