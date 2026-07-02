import java.util.*;

public class _04_Fibonacci_Recursion {

    public static int fibonacci(int nTerm) {
        // base case
        if (nTerm == 0) {
            return 0;
        }

        if (nTerm == 1 || nTerm == 2) {
            return 1;
        }

        // work
        return fibonacci(nTerm - 1) + fibonacci(nTerm - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int nTerm = sc.nextInt();
        sc.close();

        for (int i = 0; i < nTerm; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}