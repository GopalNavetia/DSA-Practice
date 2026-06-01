
public class _12_Search_in_Rotated_Array{

     public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //  found at mid
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) { // left part is sorted
                if (nums[left] <= target && target <= nums[mid]) { // target in left part
                    right = mid - 1; // target in right part
                } else {
                    left = mid + 1; // target in left part
                }
            } else {
               if (nums[mid] <= target && target <= nums[right]) { // target in left part
                    left = mid + 1; // target in left part
                } else {
                    right = mid - 1; // target in right part
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int nums[]={4,5,6,7,0,1,2};

        System.out.println(search(nums, 0));
    }
}