package com.xu.leetcode.leetcode_21;

/**
 * Description 链表节点
 * Date 2022/3/16 9:32
 * Version 1.0.1
 *
 * @author Wen
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
