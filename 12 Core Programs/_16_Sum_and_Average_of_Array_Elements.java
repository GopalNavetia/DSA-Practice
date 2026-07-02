public class _16_Sum_and_Average_of_Array_Elements {

    // Calculate Sum
    public static int sum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Calculate Average
    public static int avg(int arr[]) {
        int totalElements = arr.length - 1;

        return sum(arr) / totalElements;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Sum of Array Elements: " + sum(arr));
        System.out.println("Average of Array Elements: " + avg(arr));
    }
}