package com.xu.leetcode.leetcode_876;

/**
 * Description 876. 链表的中间结点
 * Date 2022/3/13 16:47
 * Version 1.0.1
 *
 * @author Wen
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
