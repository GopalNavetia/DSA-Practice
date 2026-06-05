public class _03_Insertion_Sort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int currElement = arr[i];
            int prevIdx = i - 1;

            // find out the correct position to insert
            while (prevIdx >= 0 && arr[prevIdx] > currElement) {
                arr[prevIdx + 1] = arr[prevIdx];
                prevIdx--;
            }

            // insert at correct position
            arr[prevIdx + 1] = currElement;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3, 5 };

        System.out.print("Before Sort: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("After Sort: ");
        printArray(arr);
    }
}