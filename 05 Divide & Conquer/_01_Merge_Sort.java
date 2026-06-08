public class _01_Merge_Sort {
    public static void mergeSort(int arr[], int si, int ei) {
        // Base Case
        if (si >= ei) {
            return;
        }

        // Work - Divide
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // Left Part
        mergeSort(arr, mid + 1, ei); // Right Part

        // Work - Divide
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // for sorted new array
        int i = si; // idx for left part
        int j = mid + 1; // idx for right part
        int k = 0; // idx for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For leftover part of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // For leftover part of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original arr
        for (int tempIdx = 0, originalIdx = si; tempIdx < temp.length; tempIdx++, originalIdx++) {
            arr[originalIdx] = temp[tempIdx];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.print("Original Array:");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array:");
        printArr(arr);
    }
}