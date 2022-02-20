package com.jackpan.leetcode.mergeTwoLists;

/**
 * 2022-02-20每日打卡第19题 目标（500题）
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode ans = null;
        if (l1 != null || l2 != null) {
            if (l1 == null) {
                head = l2;
                ans = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                head = l1;
                ans = l1;
                l1 = l1.next;
            } else {
                if (l1.val <= l2.val) {
                    head = l1;
                    ans = l1;
                    l1 = l1.next;
                } else {
                    head = l2;
                    ans = l2;
                    l2 = l2.next;
                }
            }
        }
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                head.next = l2;
                break;
            } else if (l2 == null) {
                head.next = l1;
                break;
            } else {
                if (l1.val <= l2.val) {
                    head.next = l1;
                    l1 = l1.next;
                } else {
                    head.next = l2;
                    l2 = l2.next;
                }
                head = head.next;
            }

        }

        return ans;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
