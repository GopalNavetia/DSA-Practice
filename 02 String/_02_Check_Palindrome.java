import java.util.*;

public class _02_Check_Palindrome{

    public static boolean isPalindrome(String str){
        int left=0;
        int right = str.length()-1;
        boolean ispalindrome=false;

        while (left<right) {
            if(str.charAt(left)==str.charAt(right)){
                ispalindrome=true;
            }

            left++;
            right--;
        }
        return ispalindrome;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word:");
        String str=sc.next();
        sc.close();

        System.out.println(isPalindrome(str));;

    }
}