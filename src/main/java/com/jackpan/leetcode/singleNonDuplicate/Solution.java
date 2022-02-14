package com.jackpan.leetcode.singleNonDuplicate;

/**
 * 2022-02-14每日打卡第13题 目标（500题）
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;

        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            // 头元素
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[nums.length - 2]) {
                    return nums[i];
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }


        }

        throw new RuntimeException("Not found!");
    }
}
