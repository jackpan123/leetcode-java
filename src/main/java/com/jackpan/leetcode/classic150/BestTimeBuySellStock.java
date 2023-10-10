package com.jackpan.leetcode.classic150;

/**
 * BestTimeBuySellStock操作类
 *
 * @author JackPan
 * @date 2023/10/10 10:23
 **/
public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int mineralPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < mineralPrice) {
                mineralPrice = prices[i];
            } else if (prices[i] - mineralPrice > maxProfit) {
                maxProfit = prices[i] - mineralPrice;
            }
        }

        return maxProfit;

    }
}
