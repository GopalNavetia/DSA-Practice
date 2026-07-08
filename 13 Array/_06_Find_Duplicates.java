// 1. Are elements within a fixed range (like 1 to n)? — This decides if we can use the index-marking trick.
// 2. Can there be negative numbers?
// 3. Do you want all duplicates or just any one duplicate?
// 4. Can we modify the original array?

import java.util.*;

public class _06_Find_Duplicates {

    // 1. Brute Force || TC = O(n2) || SC = O(1)
    public static void bruteForce(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    // 2. Sorting || TC = O(nlogn) || SC = O(1) || CHANGES ORIGINAL ARRAY ❌
    public static void sorting(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // 3. Hash Set || TC = O(n) || SC = O(n)
    public static void hashSet(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.contains(arr[i])) { // Not Already Present in Set
                seen.add(arr[i]);
            } else {
                duplicate.add(arr[i]);
            }
        }

        System.out.println(duplicate);
    }

    // 4. HashMap || TC = O(n) || SC = O(n)
    public static void hashMap(int arr[]) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) { // ✅ start from 0
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Duplicates: ");
        for (int key : countMap.keySet()) {
            if (countMap.get(key) > 1) {
                System.out.print(key + "(x" + countMap.get(key) + ") ");
            }
        }
    }

    // 5. Index Marking
    public static void indexMarking(int arr[]) {
        System.out.print("Duplicates: ");

        for (int i = 0; i < arr.length; i++) {

            // Step 1: get real value (it might be negative already)
            int val = Math.abs(arr[i]);

            // Step 2: find the index this value maps to
            int index = val - 1;

            // Step 3: check if already marked
            if (arr[index] < 0) {
                // already negative = visited before = DUPLICATE
                System.out.print(val + " ");
            } else {
                // mark it as visited by making it negative
                arr[index] = -arr[index];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println("Brute Force: ");
        bruteForce(arr);

        // System.out.println("\n\nSorting: ");
        // sorting(arr);

        System.out.println("\n\nHashSet: ");
        hashSet(arr);

        System.out.println("\n\nHashMap: ");
        hashMap(arr);

        System.out.println("\n\nIndexMarking: ");
        indexMarking(arr);
    }
}