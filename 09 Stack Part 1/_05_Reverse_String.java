import java.util.*;

public class _05_Reverse_String {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();

        int idx = 0;

        while (idx <= str.length() - 1) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();

        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str=new String("abc");

        str = reverseString(str);

        System.out.println(str);
    }
}