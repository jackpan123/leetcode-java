package com.jackpan.leetcode.detectCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * 2022-02-19每日打卡第17题 目标（500题）
 */
public class Solution {

    // 额外空间
//    public ListNode detectCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return head;
//            }
//
//            set.add(head);
//            head = head.next;
//        }
//        return null;
//    }

    // 进阶
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode quick = head;
        ListNode slow = head;

        while (quick != null) {
            slow = slow.next;
            if (quick.next != null) {
                quick = quick.next.next;
            } else {
                return null;
            }
            if (quick == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr;
            }
        }
        return null;
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
