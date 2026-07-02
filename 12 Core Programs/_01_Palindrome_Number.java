import java.util.*;

public class _01_Palindrome_Number{

    public static boolean isPalindrome(int n){
        int temp=n;
        int reverse=0;

        while (temp<0) {
            int lastDigit= temp%10;

            reverse=(reverse*10) + lastDigit;            

            temp/=10;
        }

        return reverse==n?true:false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= sc.nextInt();
        sc.close();

        if (isPalindrome(n)) {
            System.out.println("Valid Palindrome.");
        }else{
            System.out.println("Not Valid Palindrome.");
        }
    }
}