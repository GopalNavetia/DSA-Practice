import java.util.*;

public class _11_Armstrong_Number{

    public static boolean isArmstrong(int n){
        int sum=0;
        int temp=n;
        int countDigit=0;

        // count digit
        while (temp>0) {
            countDigit++;

            temp/=10;
        }

        // calculate sum
        temp=n;

        while (temp>0) {
            int lastDigit=temp%10;

            sum+=(int)Math.pow(lastDigit, countDigit);

            temp/=10;
        }

        // compare 
        return sum==n?true:false;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        sc.close();

        System.out.println(isArmstrong(n));
    }
}