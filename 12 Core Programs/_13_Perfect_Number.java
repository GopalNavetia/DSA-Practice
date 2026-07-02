import java.util.*;

public class _13_Perfect_Number{

    public static boolean isPerfect(int n){
        int sum=0;
        
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }

        return sum==n?true:false;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPerfect(n));
    }
}