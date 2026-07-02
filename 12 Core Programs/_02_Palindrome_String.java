import java.util.*;

public class _02_Palindrome_String {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.next();
        sc.close();

        if (isPalindrome(str)) {
            System.out.println("Valid Palindrome.");
        } else {
            System.out.println("Not Valid Palindrome.");
        }
    }
}