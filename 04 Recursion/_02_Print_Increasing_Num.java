import java.util.*;

public class _02_Print_Increasing_Num {

    public static void printIncreasingNum(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }

        // Call
        printIncreasingNum(n - 1);

        // Work
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n = sc.nextInt();
        sc.close();

        printIncreasingNum(n);
    }
}