public class _05_Count_Sort{

    public static void countSort(int arr[]){
        int largestElement=Integer.MIN_VALUE;

        // Find largest value
        for (int i = 0; i < arr.length; i++) {
            largestElement=Math.max(largestElement, arr[i]);
        }

        //  Create Count array
        int count[]= new int[largestElement+1];

        //  Calculate Frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int originalIdx=0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[originalIdx++]=i;
                count[i]--;
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
        int arr[] = { 4, 2, 1, 3, 5 };

        System.out.print("Before Sort: ");
        printArray(arr);

        countSort(arr);

        System.out.print("After Sort: ");
        printArray(arr);
    }
}