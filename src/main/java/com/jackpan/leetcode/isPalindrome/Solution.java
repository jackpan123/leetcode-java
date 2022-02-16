package com.jackpan.leetcode.isPalindrome;

/**
 * 2022-02-16每日打卡第15题 目标（500题）
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
                if (Character.isDigit(chars[first])  || Character.isDigit(chars[first])) {
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

}
