// We can also do this using stack/recursion
public class _10_Reverse_String {

    public static String reverse(String str) {
        char arr[] = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "abcd";

        str = reverse(str);

        System.out.println(str);
    }
}