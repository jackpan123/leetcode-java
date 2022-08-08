package com.jackpan.leetcode.sortedSquares;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/08 22:24
 **/
public class Solution {

    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }

        Arrays.sort(ans);

        return ans;
    }
}
