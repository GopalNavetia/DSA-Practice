public class _04_Second_Smallest_Element {

    public static int secondSmallestElement(int arr[]) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 2, 3, 4, 1, 8 };

        System.out.println(secondSmallestElement(arr));
    }
}
