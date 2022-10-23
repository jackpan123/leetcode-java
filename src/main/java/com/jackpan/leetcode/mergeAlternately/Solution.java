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

        int len = Math.min(word1.length(), word2.length());

        int i = 0;
        while (i < len) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        if (i < word1.length() - 1) {
            sb.append(word1.substring(i));
        } else {
            sb.append(word2.substring(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abcdn", "azia"));
//        System.out.println(solution.mergeAlternately("ab", "pqrs"));
//        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }
}
