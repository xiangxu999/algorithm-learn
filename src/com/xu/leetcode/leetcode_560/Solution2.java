package com.xu.leetcode.leetcode_560;

import java.util.HashMap;

/**
 * Description
 * Date 2022/1/21 13:50
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution2 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        int result = 0;
        int iSum = 0;
        for (int num : nums) {
            iSum += num;
            if (preSum.containsKey(iSum - k)) {
                result += preSum.get(iSum - k);
            }
            preSum.put(iSum, preSum.getOrDefault(iSum, 0) + 1);
        }
        return result;
    }
}
