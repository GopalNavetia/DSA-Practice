import java.util.*;

public class _05_Fibonacci_Series {

    public static int fibonacci(int nTerm) {
        // Base
        if (nTerm == 0 || nTerm == 1) {
            return nTerm;
        }

        // Call
        return fibonacci(nTerm - 1) + fibonacci(nTerm - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int nTerm = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(nTerm));
    }
}