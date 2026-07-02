import java.util.*;

public class _08_Factorial_Recursion {

    public static int factorial(int n) {
        // base case
        if (n == 1) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Result: " + factorial(n));
    }
}