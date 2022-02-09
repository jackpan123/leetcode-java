package com.jackpan.leetcode.countKDifference;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022-02-09每日打卡第10题 目标（500题）
 */
public class Solution {

    public int countKDifference(int[] nums, int k) {

        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ans += map.getOrDefault(nums[i] + k, 0) + map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return ans;
    }
}
