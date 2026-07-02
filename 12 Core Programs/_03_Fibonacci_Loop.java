import java.util.*;

public class _03_Fibonacci_Loop{

    public static void fibonacci(int n){
        int fib1=0;
        int fib2=1;

        if (n==1) {
            System.out.print(fib1+" ");
            return;
        }

        if (n==2) {
            System.out.print(fib1+" "+fib2+" ");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(fib1+" ");            
            
            int nextElement= fib1+fib2;
            
            fib1=fib2;
            fib2=nextElement;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        sc.close();

        fibonacci(n);
    }
}