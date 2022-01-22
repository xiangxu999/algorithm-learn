package com.xu.leetcode.leetcode_1109;

/**
 * Description 差分数组工具类
 * Date 2022/1/22 10:00
 * Version 1.0.1
 *
 * @author Wen
 */
public class Difference {
    /**
     * 差分数组
     */
    private int[] diff;

    /**
     * 构建差分数组
     *
     * @param nums 初始化数组
     * @return
     */
    public Difference(int[] nums) {
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    /**
     * 差分数组增删
     *
     * @param i   区间左边
     * @param j   区间右边
     * @param val 增删的数值
     */
    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    /**
     * 返回结果数组
     *
     * @return 结果数组
     */
    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for(int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
