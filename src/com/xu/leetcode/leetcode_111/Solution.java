package com.xu.leetcode.leetcode_111;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Description 111. 二叉树的最小深度
 * Date 2022/3/12 14:28
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 当前节点能够连接的节点队列
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                // 当前节点
                TreeNode current = queue.poll();
                if(current.left == null && current.right == null) {
                    return depth;
                }
                // 将当前节点所连接的节点加入节点队列
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            depth++;
        }

        return depth;

    }
}
