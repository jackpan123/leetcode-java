package com.jackpan.leetcode.detectCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * 2022-02-19每日打卡第17题 目标（500题）
 */
public class Solution {
    
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> set = new HashSet<>();
        while (pos != null) {
            if (set.contains(pos)) {
                return pos;
            } else {
                set.add(pos);
            }

            pos = pos.next;
        }

        return null;
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
