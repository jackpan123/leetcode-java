package com.jackpan.leetcode.classic150;

/**
 * MinCostClimbingStairs操作类
 *
 * @author JackPan
 * @date 2023/10/12 11:52
 **/
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int curr = 0;
        int prev = 0;

        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;

        }
        return curr;

    }
}
