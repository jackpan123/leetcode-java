package com.jackpan.leetcode.classic150;

/**
 * TwoKeysKeyboard操作类
 *
 * @author JackPan
 * @date 2023/10/26 19:21
 **/
public class TwoKeysKeyboard {

    public int minSteps(int n) {

        Integer[][] dp = new Integer[n + 1][n + 1];
        return f(0, 1, n, dp);
    }

    public int f(int ps, int cs, int n, Integer[][] dp) {
        int p = (int) 1e9, np = (int) 1e9;
        if (dp[ps][cs] != null) {
            return dp[ps][cs];
        }
        if (cs == n) {
            return 0;
        }
        if (ps != cs) {
            p = f(cs, cs, n, dp) + 1;
        }
        if (ps != 0 && ps + cs <= n) {
            np = f(ps, cs + ps, n, dp) + 1;
        }
        dp[ps][cs] = Math.min(p, np);
        return dp[ps][cs];
    }
}
