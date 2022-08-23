package com.jackpan.leetcode.reverseList;

import java.util.ArrayDeque;

/**
 * 2022-02-17每日打卡第16题 目标（500题）
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ArrayDeque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            ListNode temp = head.next;
            head.next = null;
            head = temp;
        }
        ListNode root = new ListNode(0);
        ListNode rootHead = root;
        while (!stack.isEmpty()) {
            rootHead.next = stack.pop();
            rootHead = rootHead.next;
        }

        return root.next;
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
