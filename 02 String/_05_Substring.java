public class _05_Substring {
    public static void subString(String str, int si, int ei) {
        String subString = "";

        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }

        System.out.println("New Substring: " + subString);
    }

    public static void main(String[] args) {
        String str = "Hello Java World";

        // si=0,ei=7, here ei is exclusive
        subString(str, 0, 8);

        // Using In-built funtion
        System.out.println("Using in-built function: "+str.substring(0,8));
    }
}