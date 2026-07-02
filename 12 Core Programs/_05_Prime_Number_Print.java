import java.util.*;

public class _05_Prime_Number_Print {

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrime(int n) {
        int count = 0;

        for (int i = 1; count < n; i++) {
            if (checkPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();

        // Check given number is prime or not
        System.out.println(checkPrime(n));

        // Print first n prime
        printPrime(n);
    }
}