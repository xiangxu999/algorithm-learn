package com.xu.leetcode.leetcode_1094;

/**
 * Description
 * Date 2022/1/22 11:28
 * Version 1.0.1
 *
 * @author Wen
 */
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001];
        Difference diff = new Difference(nums);

        for(int[] trip: trips) {
            int val = trip[0];
            int i = trip[1];
            int j = trip[2] - 1;
            diff.increment(i, j, val);
        }

        int[] res = diff.result();

        for(int item : res) {
            if (item > capacity) {
                return false;
            }
        }
        return true;
    }
}