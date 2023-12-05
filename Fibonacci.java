
public class Fibonacci {

    //Store all calculation
    private static long[] fibonacciCache;

    public static void main(String[] args) {

        //limits till this Fibonnacci amount
        int n = 92;
        
        fibonacciCache = new long[n + 1];

        //will let print all the numbers till n
        for (int i = 0; i<=n; i++){

             System.out.print(fibonacci(i) + " ");

        }

    }

    private static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {

            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
        
        //Storing to the Cache
        fibonacciCache[n] = nthFibonacciNumber;
        
        return nthFibonacciNumber;

    }
}