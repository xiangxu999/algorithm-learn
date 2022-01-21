package com.xu.leetcode.leetcode_303;

/**
 * Description
 * Date 2022/1/21 9:35
 * Version 1.0.1
 *
 * @author Wen
 */
class NumArray {

    private int[] myArray;

    public NumArray(int[] nums) {
        myArray = new int[nums.length + 1];
        myArray[0] = 0;
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = myArray[i - 1] + nums [i -1];
        }
    }

    public int sumRange(int left, int right) {
        return myArray[right + 1] - myArray[left];

    }
}
