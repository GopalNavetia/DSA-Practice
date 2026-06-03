public class _06_Largest_String {

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        // Compare in lexicographical order
        // .compareTo() funtion: 0 for equal
        // < 0: -ve for st1 < str2
        // > 0: +ve for st1 > str2

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest String: " + largest);
    }
}