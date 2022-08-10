package com.jackpan.leetcode.rotate;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/10 13:09
 **/
public class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % n] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, n);
    }
}
