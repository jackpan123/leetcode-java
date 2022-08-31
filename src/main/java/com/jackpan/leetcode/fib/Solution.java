package com.jackpan.leetcode.fib;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/31 13:32
 **/
public class Solution {


//    public int fib(int N) {
//        if (N == 0) {
//            return 0;
//        }
//        if (N == 1) {
//            return 1;
//        }
//        int[] dp = new int[N + 1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for (int i = 2; i <= N; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[N];
//    }

    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int p = 0;
        int q = 0;
        int r = 1;

        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }

        return r;
    }
}
