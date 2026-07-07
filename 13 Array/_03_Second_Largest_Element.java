public class _03_Second_Largest_Element {

    public static int secondLargestElement(int arr[]) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 4, 9, 8, 1, 3};
        System.out.println(secondLargestElement(arr));
    }
}