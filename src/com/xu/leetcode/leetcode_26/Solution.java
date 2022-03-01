package com.xu.leetcode.leetcode_26;

/**
 * Description Todo
 * Date 2022/3/2 9:57
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int fast = 0;
        int slow = 0;
        for(;fast < nums.length; fast++) {
            if(nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
