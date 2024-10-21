/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 
 * 可以使用荷兰国旗问题算法，该算法只需要一次遍历。
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        mid = 0;
        high = n - 1;

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
