package test;

import Junit5.Solution13;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {

    @org.junit.jupiter.api.Test
    void sortColors() {
        Solution13 solution1 = new Solution13();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution1.sortColors(nums1);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

        Solution13 solution2 = new Solution13();
        int[] nums2 = {2, 0, 1};
        solution2.sortColors(nums2);
        assertArrayEquals(new int[]{0, 1, 2}, nums2);
    }
}