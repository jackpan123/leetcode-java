package com.jackpan.leetcode.classic150;

/**
 * PerfectSquares操作类
 *
 * @author JackPan
 * @date 2023/10/28 21:33
 **/
public class PerfectSquares {

    public int numSquares(int n) {

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1;

        }

        return dp[n];

    }
    
}
