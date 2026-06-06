public class _08_Last_Occurence {
    public static int lastOccurence(int arr[], int i, int key) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        // Call
        int isFound= lastOccurence(arr, i + 1, key);
        
        // Work
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 1, 10, 2, 5, 3 };

        System.out.println(lastOccurence(arr, 0, 5));
    }
}