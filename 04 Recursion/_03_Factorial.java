import java.util.*;

public class _03_Factorial {

    public static int factorial(int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Call
        int fn = n * factorial(n - 1);

        // Work
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        sc.close();

        System.out.println(factorial(n));
    }
}