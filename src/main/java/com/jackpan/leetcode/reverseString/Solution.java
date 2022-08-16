package com.jackpan.leetcode.reverseString;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/16 13:17
 **/
public class Solution {

    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
