package com.xu.leetcode.leetcode_160;

/**
 * Description 160. 相交链表
 * Date 2022/3/16 10:37
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while(p != q) {
            if(p == null) {
                p = headB;
            } else {
                p = p.next;
            }
            if(q == null) {
                q = headA;
            } else {
                q = q.next;
            }
        }
        return q;
    }
}
