package com.jackpan.leetcode.runningSum;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/18 12:38
 **/
public class Solution {

    public int[] runningSum(int[] nums) {
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            nums[i] = prefixSum;
        }

        return nums;
    }
}
