public class _11_Valid_Anagram {

    public static boolean isValidAnagram(String s, String t) {
        // Step 1
        if (s.length() != t.length())
            return false;

        // Step 2 Create array of size 26
        int count[] = new int[26];

        // Step 3
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increment for s
            count[t.charAt(i) - 'a']--; // decrement for t
        }

        // Step 4 Check for all 0
        for (int i : count) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "act";

        System.out.println(isValidAnagram(s, t));
    }
}