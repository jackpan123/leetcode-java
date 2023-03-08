package com.jackpan.leetcode.getIntersectionNode;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/03/08 20:16
 **/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength = 0;
        int headBLength = 0;

        ListNode headATemp = headA;
        ListNode headBTemp = headB;

        while (headATemp != null) {
            headALength++;
            headATemp = headATemp.next;
        }

        while (headBTemp != null) {
            headBLength++;
            headBTemp = headBTemp.next;
        }

        int diff = Math.abs(headALength - headBLength);

        if (headALength > headBLength) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
