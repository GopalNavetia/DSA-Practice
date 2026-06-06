import java.util.*;

public class _04_Sum_of_Natural_Num{

    public static int sum(int n){
        // Base
        if (n==1) {
            return 1;
        }

        // work
        return n+sum(n-1);
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        sc.close();

        System.out.println(sum(n));
    }
}