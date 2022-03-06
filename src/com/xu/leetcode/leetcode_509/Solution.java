package com.xu.leetcode.leetcode_509;

/**
 * Description 509. 斐波那契数
 * Date 2022/3/6 13:33
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int pre = 1, cur = 1;
        for(int i = 3; i <= n; i++) {
            int sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return cur;
    }
}
