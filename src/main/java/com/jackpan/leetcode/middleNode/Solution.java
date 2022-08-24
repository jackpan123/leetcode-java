package com.jackpan.leetcode.middleNode;

/**
 * 2022-02-23每日打卡第23题 目标（500题）
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        int index = length / 2;
        node = head;
        while (index > 0) {
            node = node.next;
            index--;
        }

        return node;
    }

    static class ListNode {
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
