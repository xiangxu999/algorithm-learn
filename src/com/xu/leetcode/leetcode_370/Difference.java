package com.xu.leetcode.leetcode_370;

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
     * 输入一个初始数组，构建我们的差分数组
     *
     * @param nums 初始数组
     */
    public Difference(int[] nums) {
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    /**
     * 给闭区间 [i,j] 增加 val（可以是负数）
     *
     * @param i   i
     * @param j   j
     * @param val 增加的数值
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
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
