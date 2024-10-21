package test;
import Junit5.Solution13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L2022211979_13_Teat {
    //测试用例设计的总体原则，等价类划分原则：{只包含0的数组}，{只包含1的数组}，{只包含2的数组}，{包含0、1、2中任意两个元素的混合数组}，{包含0、1、2所有元素的混合数组}，{空数组}，{单个元素的数组（0、1、2）}
    @Test  //测试每个颜色重复多次出现的情况下是否可以正常排序，{包含0、1、2所有元素的混合数组}
    public void testSortColors_Example1() {
        Solution13 solution = new Solution13();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test  //{包含0、1、2所有元素的混合数组}
    public void testSortColors_Example2() {
        Solution13 solution = new Solution13();
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test  //{只包含0的数组}
    public void testSortColors_AllZeros() {
        Solution13 solution = new Solution13();
        int[] nums = {0, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test  //{只包含1的数组}
    public void testSortColors_AllOnes() {
        Solution13 solution = new Solution13();
        int[] nums = {1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1}, nums);
    }

    @Test  //{只包含2的数组}
    public void testSortColors_AllTwos() {
        Solution13 solution = new Solution13();
        int[] nums = {2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{2, 2, 2}, nums);
    }

    @Test
    public void testSortColors_MixedOrder() {
        Solution13 solution = new Solution13();
        int[] nums = {0, 2, 1, 2, 0, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test  //{空数组}
    public void testSortColors_EmptyArray() {
        Solution13 solution = new Solution13();
        int[] nums = {};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test  //{单个元素的数组（0、1、2）}
    public void testSortColors_SingleElement() {
        Solution13 solution = new Solution13();
        int[] nums = {0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0}, nums);

        nums = new int[]{1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1}, nums);

        nums = new int[]{2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{2}, nums);
    }
}
