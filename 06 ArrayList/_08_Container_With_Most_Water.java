import java.util.*;

public class _08_Container_With_Most_Water {

    // Brute Force
    public static int bruteForce(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;

                int currWater = minHeight * width;

                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    // Two Pointer
    public static int twoPointer(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            int minHeight = Math.min(height.get(left), height.get(right));
            int width = right - left;

            int currWater = minHeight * width;

            maxWater = Math.max(maxWater, currWater);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(bruteForce(height));
        System.out.println(twoPointer(height));
    }
}