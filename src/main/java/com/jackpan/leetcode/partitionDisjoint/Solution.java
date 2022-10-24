package com.jackpan.leetcode.partitionDisjoint;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/24 13:10
 **/
class Solution {
    public int partitionDisjoint(int[] nums) {
        int len = nums.length;
        int[] minRight = new int[len];
        minRight[len - 1] = nums[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], nums[i]);
        }

        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
            if (max <= minRight[i + 1]) {
                return i + 1;
            }
        }

        return len - 1;
    }
}
