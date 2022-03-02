package com.xu.leetcode.leetcode_283;

/**
 * Description 283. 移动零
 * Date 2022/3/2 11:03
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int p = removeElement(nums, 0);
        // 将 p 之后的所有元素赋值为 0
        for (; p < nums.length; p++) {
            nums[p] = 0;
        }
    }
    public static int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
