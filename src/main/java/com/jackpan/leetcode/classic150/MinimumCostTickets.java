package com.jackpan.leetcode.classic150;

/**
 * MinimumCostTickets操作类
 * dp[i] = min(dp[j1] + cost[0], dp[j7] + cost[1], dp[j30] + cost[2])
 *
 *
 * @author JackPan
 * @date 2023/10/26 14:20
 **/
public class MinimumCostTickets {

    int[] duration = new int[]{1, 7, 30};
    int[] days;

    int[] costs;

    Integer[] memo;

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        this.memo = new Integer[days.length];

        return dp(0);
    }

    private int dp(int i) {
        if (i >= this.days.length) {
            return 0;
        }

        if (memo[i] != null) {
            return memo[i];
        }

        memo[i] = Integer.MAX_VALUE;
        int j = i;
        for (int k = 0; k < 3; k++) {
            while (j < days.length && days[j] < days[i] + duration[k]) {
                j++;
            }

            memo[i] = Math.min(memo[i], dp(j) + costs[k]);
        }

        return memo[i];
    }


}
