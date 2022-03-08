package com.xu.leetcode.leetcode_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description 51. N 皇后
 * Date 2022/3/8 15:38
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        // "." 表示空，"Q"表示皇后，初始化棋盘，就是选择列表
        char[][] board = new char[n][n];
        for (char[] c : board) {
            Arrays.fill(c, '.');
        }
        backTrack(board, 0);
        return result;
    }

    void backTrack(char[][] board, int row) {
        // 满足条件
        if (row == board.length) {
            result.add(charToList(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            // 排除可以相互攻击的格子
            if (!isValid(board, row, col)) {
                continue;
            }
            // 做选择
            board[row][col] = 'Q';
            // 递归
            backTrack(board, row + 1);
            // 撤销选择
            board[row][col] = '.';
        }
    }

    public List<String> charToList(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] temp : board) {
            list.add(String.copyValueOf(temp));
        }
        return list;
    }

    public Boolean isValid(char[][] board, int row, int col) {
        int n = board.length;
        // 检查列
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 检查右上方是否有皇后冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j <= n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 检查左上方是否有皇后冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

}
