package com.xu.leetcode.leetcode_303;

/**
 * Description 区域和检索 - 数组不可变
 * Date 2022/1/21 9:25
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        int[] index = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(index);
        // return 1 ((-2) + 0 + 3)
        System.out.println(numArray.sumRange(0, 2));
        // return -1 (3 + (-5) + 2 + (-1))
        System.out.println(numArray.sumRange(2, 5));
        // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
        System.out.println(numArray.sumRange(0, 5));
    }
}

