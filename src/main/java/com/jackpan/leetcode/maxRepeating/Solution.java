package com.jackpan.leetcode.maxRepeating;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/11/03 13:19
 **/
public class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;

        int n = word.length();
        int j = 0;
        int curr = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == word.charAt(j)) {
                j++;
                if (j == n) {
                    curr++;
                    j = 0;
                }
            } else {
                j = 0;
                ans = Math.max(ans, curr);
                curr = 0;
            }

        }

        ans = Math.max(ans, curr);

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }
}
