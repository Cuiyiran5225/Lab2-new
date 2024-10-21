package Junit5;

public class Solution13 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap 0 to the correct position
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is already in the correct position, just move to the next element
                mid++;
            } else { // nums[mid] == 2
                // Swap 2 to the end and reduce the range to check
                swap(nums, mid, high);
                high--;
                // Do not increment mid here, because the swapped element has not been checked yet
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
