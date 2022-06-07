package com.jackpan.leetcode.minEatingSpeed;

/**
 * 每日打卡第32题 目标（500题）
 *
 * @author JackPan
 * @date 2022/06/07 09:37
 **/
public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            int spendTime = getTime(speed, piles);

            if (spendTime <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }

        return k;
    }

    private int getTime(int speed, int[] piles) {
        int spendTime = 0;
        for (int pile : piles) {
            int currTime = (pile + speed - 1) / speed;
            spendTime += currTime;
        }

        return spendTime;
    }
}
