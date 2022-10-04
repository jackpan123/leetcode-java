package com.jackpan.leetcode.minAddToMakeValid;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/04 09:30
 **/
public class Solution {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int leftNumber = 0;
        int needAddLeft = 0;

        for (int i = 0; i < chars.length; i ++) {
            if (chars[i] == '(') {
                leftNumber++;
            } else {
                if (leftNumber != 0) {
                    leftNumber--;
                } else {
                    needAddLeft++;
                }
            }
        }

        return leftNumber + needAddLeft;
    }
}
