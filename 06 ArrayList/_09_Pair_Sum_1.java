import java.util.*;

public class _09_Pair_Sum_1 {

    // Brute Force
    public static boolean bruteForce(ArrayList<Integer> list, int targetSum) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == targetSum) {
                    return true;
                }
            }
        }

        return false;
    }

    // Two Pointer
    public static boolean twoPointer(ArrayList<Integer> list, int targetSum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int currSum = list.get(left) + list.get(right);

            if (currSum == targetSum) {
                return true;
            }

            if (currSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(bruteForce(list, 5));
        System.out.println(twoPointer(list, 12));

    }
}