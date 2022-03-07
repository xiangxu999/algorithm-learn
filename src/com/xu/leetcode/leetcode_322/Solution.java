package com.xu.leetcode.leetcode_322;

import java.util.Arrays;

/**
 * Description 322. 零钱兑换
 * Date 2022/3/7 19:43
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    int[] nums;

    public int coinChange(int[] coins, int amount) {
        nums = new int[amount + 1];
        // -10表示等于amount的子问题没有得到解决
        Arrays.fill(nums, -10);
        return dp(coins, amount);
    }

    int dp(int[] coins, int amount) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        // 子问题已经得到解决
        if (nums[amount] != -10) {
            return nums[amount];
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subPro = dp(coins, amount - coin);
            if (subPro == -1) {
                continue;
            }
            res = Math.min(res, subPro + 1);
        }
        // 把计算结果存入备忘录
        nums[amount] = (res == Integer.MAX_VALUE) ? -1 : res;
        return nums[amount];
    }
}
