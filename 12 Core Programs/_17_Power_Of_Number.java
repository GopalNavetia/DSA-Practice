import java.util.*;

public class _17_Power_Of_Number{

    public static int power(int n,int x){
        int ans=1;
        
        for (int i = 1; i <=x; i++) {
            ans*=n;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();

        System.out.print("Enter power of number: ");
        int x=sc.nextInt();
        sc.close();

        System.out.println("Result: "+power(n,x));
    }
}