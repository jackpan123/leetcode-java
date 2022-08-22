package com.jackpan.leetcode.isSubsequence;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/22 19:19
 **/
public class Solution {

    public boolean isSubsequence(String s, String t) {

        int tPoint = 0;
        int sPoint = 0;
        int sLen = s.length();
        int tLen = t.length();
        while (sPoint < sLen && tPoint < tLen) {

            if (s.charAt(sPoint) == t.charAt(tPoint)) {
                sPoint++;
            }

            tPoint++;
        }

        return sPoint == sLen;
    }
}
