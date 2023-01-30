package com.jackpan.leetcode.mergeInBetween;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/01/30 13:19
 **/
public class Solution {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode res = list1;
        int headIndex = 0;
        ListNode list2End = list2;
        while (list2End.next != null) {
            list2End = list2End.next;
        }

        while (list1 != null) {
            ListNode temp = list1.next;
            if (a - 1 == headIndex) {
                list1.next = list2;
            }

            if (b + 1 == headIndex) {
                list2End.next = list1;
            }
            list1 = temp;
            headIndex++;
        }
        return res;
    }


      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}
