package com.jackpan.leetcode.removeNthFromEnd;

/**
 * 2022-02-21每日打卡第20题 目标（500题）
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode temp = newHead;

        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = newHead;
        int index = length - n;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return newHead.next;
    }

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
}
