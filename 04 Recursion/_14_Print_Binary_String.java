public class _14_Print_Binary_String {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Work
        if (lastPlace == 0) {
            // Sit 0/1 on chair
            printBinStrings(n - 1, 0, str + "0");
            printBinStrings(n - 1, 1, str + "1");
        } else {
            printBinStrings(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}