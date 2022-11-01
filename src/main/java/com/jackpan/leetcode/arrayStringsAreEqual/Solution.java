package com.jackpan.leetcode.arrayStringsAreEqual;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/11/01 13:11
 **/
public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int j = 0;

        while (p1 < word1.length && p2 < word2.length) {
            if (word1[p1].charAt(i) != word2[p2].charAt(j)) {
                return false;
            }

            i++;

            if (i == word1[p1].length()) {
                p1++;
                i = 0;
            }
            j++;
            if (j == word2[p2].length()) {
                p2++;
                j = 0;
            }
        }

        return p1 == word1.length && p2 == word2.length;
    }
}
