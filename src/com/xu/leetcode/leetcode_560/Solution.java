package com.xu.leetcode.leetcode_560;

/**
 * Description
 * Date 2022/1/21 12:03
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] poArray = new int[nums.length + 1];
        poArray[0] = 0;
        for (int i = 1; i < poArray.length; i++) {
            poArray[i] = poArray[i - 1] + nums[i -1];
        }
        int result = 0;
        for (int i = 0; i < poArray.length; i++) {
            for (int j = i + 1; j < poArray.length; j++) {
                if (poArray[j] - poArray[i] == k) {
                    result++;
                }
            }
        }
        return result;

    }
}
