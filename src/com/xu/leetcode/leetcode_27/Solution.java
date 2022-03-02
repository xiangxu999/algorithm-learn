package com.xu.leetcode.leetcode_27;

/**
 * Description 27. 移除元素
 * Date 2022/3/2 10:36
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int fast = 0;
        int slow = 0;
        while(fast < nums.length) {
            if(nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
