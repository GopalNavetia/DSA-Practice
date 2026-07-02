import java.util.*;

public class _12_Strong_Number {
    public static int factorial(int n){
        int fact=1;

        for (int i = 1; i <=n; i++) {
            fact*=i;
        }

        return fact;
    }

    public static boolean isStrong(int n){
        int sum=0;
        int temp=n;

        // calculate sum of factorial of each digit
        while (temp>0) {
            int lastDigit=temp%10;

            sum+=factorial(lastDigit);

            temp/=10;
        }

        // compare
        return sum==n? true:false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(isStrong(n));
    }
}