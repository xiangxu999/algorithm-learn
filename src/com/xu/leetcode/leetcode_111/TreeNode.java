package com.xu.leetcode.leetcode_111;

/**
 * Description 两叉树节点
 * Date 2022/3/12 14:35
 * Version 1.0.1
 *
 * @author Wen
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
