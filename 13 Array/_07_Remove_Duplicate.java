
// 1. Should the order of elements be preserved?
// 2. Should we return a new array or modify in place?
// 3. Is the array sorted or unsorted?
// 4. What to do with the original array?
import java.util.*;

public class _07_Remove_Duplicate {

    // 1. Brute Force || TC = O(n2) || SC = O(n)
    public static void bruteForce(int arr[]) {
        int temp[] = new int[arr.length];
        int k = 0; // pointer for temp

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check all previous elements
            for (int j = 0; j < i; j++) { // till i
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // keep uniwue element
            if (!isDuplicate) {
                temp[k++] = arr[i];
            }
        }

        System.out.println("Unique Elements");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    // 2. Sorting|| TC = O(nlogn) || SC= O(1)
    public static void sorting(int arr[]) {
        Arrays.sort(arr);

        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // 3. HashSet + LinkedHashSet (For Preserv Order) || TC = O(n) || SC = O(n)
    public static void hashSet(int arr[]) {
        // HashSet<Integer> seen = new HashSet<>();
        // LinkedHashSet<Integer> unique = new LinkedHashSet<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (!seen.contains(arr[i])) {
        // seen.add(arr[i]);
        // unique.add(arr[i]);
        // }
        // }

        // System.out.println(unique);

        // **** SIMPLIFY ****
        LinkedHashSet<Integer> result = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]); // duplicates auto rejected ✅
        }

        System.out.println("Result: " + result);
    }

    // 4. Two Pointer + Sort || TC = O(nlogn) || SC = O(1);
    public static void twoPointer(int arr[]) {
        Arrays.sort(arr);

        int i = 0; // marks the boundary of unique elements

        for (int j = 1; j < arr.length; j++) { // j keeps moving forward looking for new unique elements
            if (arr[i] != arr[j]) { // found new unique element
                i++;
                arr[i] = arr[j];

            }

            // if duplicate → do nothing, j auto moves in for loop
        }
        
        // print only unique part
        System.out.print("Result: ");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };

        System.out.println("Brute Force: ");
        bruteForce(arr);

        // System.out.println("\n\nSorting: ");
        // sorting(arr);

        System.out.println("\n\nHashSet + LinkedHashSet: ");
        hashSet(arr);

        System.out.println("\n\nTwo Pointer + Sort: ");
        twoPointer(arr);
    }
}