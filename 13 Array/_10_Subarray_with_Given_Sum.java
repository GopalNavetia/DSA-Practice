// 1. Are all elements positive or can there be negatives?
// 2. Should we print all subarrays or just first one?
// 3. Should we print elements or just indexes?

// 🧑‍🏫 This matters because the Sliding Window trick only works for positive numbers!

public class _10_Subarray_with_Given_Sum {

    // 1. Brute Force | TC = O(n2) | SC = O(1)
    public static void bruteforce(int arr[], int target) {
        for (int start = 0; start < arr.length; start++) {
            int sum = 0; // ✅ reset sum for each start

            for (int end = start; end < arr.length; end++) {
                sum += arr[end]; // ✅ keep adding arr[end]

                if (sum == target) {
                    System.out.print("[ ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.print("] ");
                }
            }
        }
    }

    // 2. Sliding Window | TC = O() | SC = O()
    public static void slidingWindow(int arr[], int target) {
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            if (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.print("[ ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print("] ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int target = 12;

        System.out.println("BruteForce: ");
        bruteforce(arr, target);

        System.out.println("\n\nSliding Window: ");
        slidingWindow(arr, target);
    }
}