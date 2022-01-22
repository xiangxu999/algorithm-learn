package com.xu.leetcode.leetcode_1109;

import com.xu.leetcode.leetcode_1109.Difference;

/**
 * Description
 * Date 2022/1/22 10:44
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        Difference diff = new Difference(nums);
        for(int[] booking: bookings) {
            int i = booking[0] - 1;
            int j = booking[1] - 1;
            int val = booking[2];
            diff.increment(i, j, val);
        }
        return diff.result();
    }
}
