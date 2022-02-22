package com.jackpan.leetcode.removeNthFromEnd;

/**
 * 2022-02-21每日打卡第20题 目标（500题）
 */
public class Solution {

    // 预处理长度
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode newHead = new ListNode();
//        newHead.next = head;
//        ListNode temp = newHead;
//
//        int length = 0;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//
//        temp = newHead;
//        int index = length - n;
//
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        temp.next = temp.next.next;
//        return newHead.next;
//    }

    // 一次遍历
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode();

        ListNode first = newHead;
        ListNode second = newHead;
        int start = 0;
        while (first != null) {
            if (start <= n) {
                start++;
            } else {
                second = second.next;
            }
            first = first.next;
        }

        second.next = second.next.next;
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
