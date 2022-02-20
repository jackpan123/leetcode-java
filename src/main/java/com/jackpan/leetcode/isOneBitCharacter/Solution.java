package com.jackpan.leetcode.isOneBitCharacter;

/**
 * 2022-02-20每日打卡第18题 目标（500题）
 */
public class Solution {

    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }
        for (int i = 0; i < bits.length; ) {
            if (bits[i] == 1) {
                if (i == bits.length - 2) {
                    return false;
                }
                i += 2;
            } else {
                i ++;
            }
        }
        return true;
    }
}
