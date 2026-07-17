// 1. Is the array sorted?
// 2. Return indexes or values?
// 3. What if element is not found? (return -1)
// 4. What if element appears only once? (first = last = that index)

public class _11_Find_First_and_Last_Occurrence {

    // 1. Brute Force | TC = O(n) | SC = O(1);
    public static void bruteforce(int arr[], int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println("First: " + first + "\nLast: " + last);
    }

    // 2. Binary Search | TC = O(log n) | SC = O(1)
    public static void binarySearch(int arr[], int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                answer = mid;
                if (findFirst) {
                    end = mid - 1; // if find first
                } else {
                    start = mid + 1; // if find last
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (findFirst) {
            System.out.println("First Occurrence: " + answer);
        } else {
            System.out.println("Last Occurrence: " + answer);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;

        System.out.println("Brute Force: ");
        bruteforce(arr, target);

        System.out.println("\nBinary Search: ");
        binarySearch(arr, target, true); // find first
        binarySearch(arr, target, false); // find last
    }
}