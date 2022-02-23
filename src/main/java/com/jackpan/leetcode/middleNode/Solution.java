package com.jackpan.leetcode.middleNode;

/**
 *
 * 2022-02-23每日打卡第23题 目标（500题）
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode newHead = head;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        int index = length / 2;
        while (index != 0) {
            newHead = newHead.next;
            index--;
        }

        return newHead;
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
