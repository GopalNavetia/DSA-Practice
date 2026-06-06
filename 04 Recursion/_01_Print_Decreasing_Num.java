import java.util.*;

public class _01_Print_Decreasing_Num{

    public static void printDecreasingNum(int n){
        // Base Case
        if (n==1) {
            System.out.println(n);
            return;
        }

        // Work
        System.out.println(n+" ");

        // Call
        printDecreasingNum(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        sc.close();

        printDecreasingNum(n);
    }
}