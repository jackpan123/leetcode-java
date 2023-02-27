package com.jackpan.leetcode.movesToMakeZigzag;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/27 19:59
 **/
class Solution {
    public int movesToMakeZigzag(int[] nums) {
        return Math.min(calculator(nums, 0), calculator(nums, 1));
    }

    public int calculator(int[] nums, int position) {
        int res = 0;
        for (int i = position; i < nums.length; i += 2) {
            int a = 0;
            if (i - 1 >= 0) {
                a = Math.max(a, nums[i] - nums[i - 1] + 1);
            }

            if (i + 1 < nums.length) {
                a = Math.max(a, nums[i] - nums[i + 1] + 1);
            }

            res += a;
        }

        return res;
    }
}
