package com.jackpan.leetcode.reverseList;

/**
 * 2022-02-17每日打卡第16题 目标（500题）
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode endNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = endNode;
            endNode = head;
            head = temp;
        }

        return endNode;
    }

    class ListNode {
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
