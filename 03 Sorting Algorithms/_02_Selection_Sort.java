public class _02_Selection_Sort {

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int turn = 0; turn <= n - 2; turn++) {
            int minElementIndex = turn; // assume at index

            for (int i = turn + 1; i <= n - 1; i++) {
                if (arr[minElementIndex] > arr[i]) {
                    minElementIndex = i;
                }
            }

            // swap
            int temp = arr[turn];
            arr[turn] = arr[minElementIndex];
            arr[minElementIndex] = temp;
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

        selectionSort(arr);

        System.out.print("After Sort: ");
        printArray(arr);
    }
}