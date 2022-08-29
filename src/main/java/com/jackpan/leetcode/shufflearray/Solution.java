package com.jackpan.leetcode.shufflearray;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/29 20:16
 **/
public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }
}
