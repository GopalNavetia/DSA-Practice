public class _04_Reverse_Array {

    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.print("Original array:");
        printArray(arr);

        reverse(arr);

        System.out.print("Reverse array:");
        printArray(arr);
    }
}