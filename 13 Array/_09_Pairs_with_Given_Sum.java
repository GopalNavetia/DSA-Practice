// 1. Can the same element be used twice?
// 2. Can there be negative numbers?
// 3. Should we print all pairs or just first one?
// 4. Is the array sorted or unsorted?

import java.util.*;

public class _09_Pairs_with_Given_Sum {

    // 1. Brute Force | TC = O(n2)| SC = O(1)
    public static void bruteforce(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                }
            }
        }
    }

    // 2. Sorting + Two Pointer | TC =O(nlogn) | Sc =O(1)
    public static void sortingTwoPointer(int arr[], int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.print("(" + arr[left] + "," + arr[right] + ") ");

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    // 3. HashSet | TC = O(n) | SC = O(n)
    public static void hashSet(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int secondElement = target - arr[i]; // ✅ check complement first

            if (set.contains(secondElement)) {
                System.out.print("(" + arr[i] + "," + secondElement + ") ");
            }

            set.add(arr[i]); // ✅ add after checking
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 7, 1 };
        int target = 6;

        System.out.println("BruteForce: ");
        bruteforce(arr, target);

        System.out.println("\n\nSorting + Two Pointer: ");
        sortingTwoPointer(arr, target);

        System.out.println("\n\n HashSet: ");
        hashSet(arr, target);
    }
}