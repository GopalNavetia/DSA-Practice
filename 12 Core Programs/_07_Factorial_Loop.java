import java.util.*;

public class _07_Factorial_Loop{

    public static void factorial(int n){
        int fact=1;

        for (int i = 1; i <= n; i++) {
            fact*=i;
        }

        System.out.println("Result: "+fact);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= sc.nextInt();
        sc.close();

        factorial(n);
    }
}