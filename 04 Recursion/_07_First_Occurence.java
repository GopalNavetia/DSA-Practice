public class _07_First_Occurence {
    public static int firstOccurence(int arr[], int i, int key) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Work
        if (arr[i] == key) {
            return i;
        }

        // Call
        return firstOccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 1, 10, 2, 5, 3 };

        System.out.println(firstOccurence(arr, 0, 10));
    }
}