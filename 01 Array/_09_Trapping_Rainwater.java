public class _09_Trapping_Rainwater {

    public static int waterTrapped(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int trapped_water = 0;

        while (left < right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            if (maxLeft < maxRight) {
                trapped_water += maxLeft - height[left];
                left++;
            } else {
                trapped_water += maxRight - height[right];
                right--;
            }
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(waterTrapped(height));

    }
}