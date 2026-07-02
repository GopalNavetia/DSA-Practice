import java.util.*;

public class _06_Prime_in_Range {

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

    public static void primeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();
        sc.close();

        primeInRange(start, end);
    }
}