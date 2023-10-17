package com.jackpan.leetcode.classic150;

import java.util.Arrays;

/**
 * CoinChange操作类
 *
 * @author JackPan
 * @date 2023/10/17 09:19
 **/
public class CoinChange {


    // dp[i] = dp[i - coin[i]] + 1

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? - 1: dp[amount];
    }
    
}
