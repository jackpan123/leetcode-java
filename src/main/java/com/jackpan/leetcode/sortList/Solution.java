package com.jackpan.leetcode.sortList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 2022-02-24每日打卡第24题 目标（500题）
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        if (list.isEmpty()) {
            return head;
        }

        list.sort((o1, o2) -> {
            if (o1.val > o2.val) {
                return 1;
            } else if (o1.val < o2.val) {
                return -1;
            }
            return 0;
        });

        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        for (int i = 0; i < list.size(); i++) {
            temp.next = list.get(i);
            temp = temp.next;
            if (i == list.size() - 1) {
                temp.next = null;
            }
        }

        return newHead.next;
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
