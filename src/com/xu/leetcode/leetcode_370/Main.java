package com.xu.leetcode.leetcode_370;

/**
 * Description
 * Date 2022/1/22 10:14
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        getModifiedArray(5, new int[][]{{1, 3, 2}, {2, 4, 3}, {0, 2, -2}});
    }

    public static int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        Difference diff = new Difference(nums);

        for (int[] update : updates) {
            int i = update[0];
            int j = update[1];
            int val = update[2];
            diff.increment(i, j, val);
            //for (int item : diff.result()) {
            //    System.out.println(item);
            //}
        }
        return diff.result();
    }
}
