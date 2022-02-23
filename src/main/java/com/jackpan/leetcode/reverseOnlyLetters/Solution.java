package com.jackpan.leetcode.reverseOnlyLetters;

/**
 *
 * 2022-02-23每日打卡第22题 目标（500题）
 */
public class Solution {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int n = chars.length - 1;
        int end = n;

        while (start < end) {
            while (start < n && !Character.isLetter(chars[start])) {
                start++;
            }

            while (end > 0 &&!Character.isLetter(chars[end])) {
                end--;
            }

            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
            }
            start++;
            end--;
        }

        return new String(chars);
    }
}
