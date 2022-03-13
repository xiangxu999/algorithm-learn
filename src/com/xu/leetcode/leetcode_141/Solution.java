package com.xu.leetcode.leetcode_141;

/**
 * Description 141. 环形链表
 * Date 2022/3/13 15:45
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
