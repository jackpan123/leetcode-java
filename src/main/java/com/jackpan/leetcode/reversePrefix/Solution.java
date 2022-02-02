package com.jackpan.leetcode.reversePrefix;

/**
 * 2022-02-02每日打卡第3题 目标（500题）
 */
public class Solution {

    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        char[] chars = word.toCharArray();
        for (int i = 0; i < index; ) {
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            index--;
            i++;
        }


        return new String(chars);
    }
}
