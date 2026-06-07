    public class _12_Remove_Duplicate {

        public static void removeDuplicates(String str, StringBuilder newStr, int idx, boolean map[]) {
            // Base Case
            if (idx == str.length()) {
                System.out.println(newStr);
                return;
            }

            // Work
            char currChar = str.charAt(idx);

            if (map[currChar - 'a'] == true) {
                // Duplicate exist
                removeDuplicates(str, newStr, idx + 1, map); // Call
            } else {
                // No Duplicate exist -> Add character in string
                map[currChar-'a']=true;
                removeDuplicates(str, newStr.append(currChar), idx + 1, map); // Call
            }
        }

        public static void main(String[] args) {
            removeDuplicates("appnacollege", new StringBuilder(), 0, new boolean[26]);
        }
    }