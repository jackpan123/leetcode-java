package com.jackpan.leetcode.isPalindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022-02-16每日打卡第15题 目标（500题）
 * 2022-02-22每日打卡第21题 目标（500题）
 */
public class Solution {

    public boolean isPalindrome(String s) {

        char[] chars = s.toCharArray();
        int first = 0;
        int last = s.length() - 1;
        boolean ans = true;
        while (first <= last) {
            if (!Character.isLetterOrDigit(chars[first])) {
                first++;
                continue;
            }

            if (!Character.isLetterOrDigit(chars[last])) {
                last--;
                continue;
            }

            if (chars[first] != chars[last]) {
                if (Character.isDigit(chars[first]) || Character.isDigit(chars[first])) {
                    ans = false;
                } else {
                    if (chars[first] + 32 != chars[last] && chars[first] != chars[last] + 32) {
                        ans = false;
                        break;
                    }
                }
            }
            first++;
            last--;

        }
        return ans;
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {
            if (list.get(start).compareTo(list.get(end)) != 0) {
                return false;
            }
            start++;
            end--;
        }

        return true;
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
