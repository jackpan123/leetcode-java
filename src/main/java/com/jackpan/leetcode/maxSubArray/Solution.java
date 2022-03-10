package com.jackpan.leetcode.maxSubArray;

/**
 *
 * 2022-03-10每日打卡第27题 目标（500题）
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            ans = Math.max(pre, ans);
        }
        return ans;
    }

}
