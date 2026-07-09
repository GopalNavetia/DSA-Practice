// 1. Is exactly one number missing?
// 2. Are numbers in range 1 to n only?
// 3. Are there any duplicates?
// 4. Is the array sorted or unsorted?

import java.util.Arrays;

public class _08_Find_Missing_Number {

    // 1. Brute Force || TC = O(n2) || SC = O(1)
    public static void bruteForce(int arr[]) {
        for (int i = 1; i <= arr.length + 1; i++) {
            boolean isFound = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.print(i + " ");
                return;
            }
        }
    }

    // 2. Sorting || TC = O(n log n) || SC = O(1)
    public static void sorting(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) { // element should be i+1 if no missing
                System.out.print((i + 1) + " ");
                return;
            }
        }
    }

    // 3. SumFormula || TC = O(n) || SC = O(1)
    public static void sumFormula(int arr[]) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2; // sum of 1 to n

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i]; // sum of array elements
        }

        System.out.println((expectedSum - actualSum) + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };

        System.out.println("BruteForce: ");
        bruteForce(arr);

        System.out.println("\n\nSorting: ");
        sorting(arr);

        System.out.println("\n\nSum Formula: ");
        sumFormula(arr);
    }
}