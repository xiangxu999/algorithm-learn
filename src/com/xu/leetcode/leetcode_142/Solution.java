package com.xu.leetcode.leetcode_142;

/**
 * Description 142. 环形链表 II
 * Date 2022/3/13 16:23
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast;
        ListNode slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        // 判断没有环的情况
        if (fast == null || fast.next == null) {
            // fast 遇到空指针说明没有环
            return null;
        }

        // 重新指向头结点
        slow = head;
        // 快慢指针同步前进，相交点就是环起点
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
