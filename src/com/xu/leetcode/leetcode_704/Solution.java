package com.xu.leetcode.leetcode_704;

/**
 * Description 704. 二分查找
 * Date 2022/3/3 10:38
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int middle = left + (right - left) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] < target) {
                left = middle + 1;
            } else if(nums[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
