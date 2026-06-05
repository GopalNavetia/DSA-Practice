
public class _01_Bubble_Sort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int turn = 1; turn <= n - 1; turn++) {
            for (int i = 0; i <= n - turn - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        System.out.print("Before Sort: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("After Sort: ");
        printArray(arr);
    }
}