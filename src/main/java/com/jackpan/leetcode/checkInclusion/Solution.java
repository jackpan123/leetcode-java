package com.jackpan.leetcode.checkInclusion;

/**
 *
 * 2022-03-08每日打卡第26题 目标（500题）
 */
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int[] array = new int[26];

        for (int i = 0; i < s1.toCharArray().length; i++) {
            array[s1.charAt(i) - 'a']++;
            array[s2.charAt(i) - 'a']--;
        }

        if (isAllZero(array)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            array[s2.charAt(i) - 'a']--;
            array[s2.charAt(i - s1.length()) - 'a']++;
            if (isAllZero(array)) {
                return true;
            }
        }

        return false;
    }

    private boolean isAllZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
