package com.jackpan.leetcode.mergeAlternately;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/23 22:52
 **/
public class Solution {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;
        int n = word1.length();
        int m = word2.length();

        while (i < n || j < m) {
            if (i < n) {
                sb.append(word1.charAt(i));
                i++;
            }

            if (j < m) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }

}
