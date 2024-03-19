package com.jackpan.leetcode.classic150;

import java.util.*;

/**
 * SortList操作类
 *
 * @author JackPan
 * @date 2024/03/19 13:37
 **/
class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummyHead = new ListNode(0, head);
        for (int subLength = 1; subLength < length; subLength <<= 1) {
            ListNode prev = dummyHead;
            ListNode curr = dummyHead.next;
            while (curr != null) {

                ListNode head1 = curr;
                for (int i = 1; i < subLength && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;
                for (int i = 1; i < subLength && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }


                ListNode merged = merge(head1, head2);
                prev.next = merged;
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;


            }
        }

        return dummyHead.next;
    }

    private ListNode merge(ListNode head1, ListNode head2) {

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                curr.next = temp1;
                temp1 = temp1.next;
            } else {
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }

        if (temp1 != null) {
            curr.next = temp1;
        } else if (temp2 != null) {
            curr.next = temp2;
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {


        ListNode newHead = new ListNode();
        ListNode current = newHead;
        int[] arr = new int[]{-1, 5, 3, 4, 0};
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(4);
//        }
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            current.next = node;
            current = current.next;
        }
        SortList sortList = new SortList();
        sortList.sortList(newHead.next);
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
