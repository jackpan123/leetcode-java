package com.jackpan.leetcode.minStartValue;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/09 13:28
 **/
public class Solution {


    public int minStartValue(int[] nums) {

        int numberSum = 0;
        int numberMiniSum = 0;

        for (int num : nums) {
            numberSum += num;
            numberMiniSum = Math.min(numberMiniSum, numberSum);
        }

        return -numberMiniSum + 1;
    }
}
