package com.xu.leetcode.leetcode_304;

/**
 * Description
 * Date 2022/1/21 10:41
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {
    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[][]{{3,0,1,4,2}, {5,6,3,2,1}, {1,2,0,1,5}, {4,1,0,1,7}, {1,0,3,0,5}});
        // return 8 (红色矩形框的元素总和)
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        // return 11 (绿色矩形框的元素总和)
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        // return 12 (蓝色矩形框的元素总和)
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));
    }
}
