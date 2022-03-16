package com.xu.leetcode.leetcode_21;

/**
 * Description 21. 合并两个有序链表
 * Date 2022/3/16 9:35
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 头结点
        ListNode head = new ListNode(-1), p = head;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            // 比较 p1 和 p2 两个指针
            // 将值较小的的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }
        return head.next;
    }
}
