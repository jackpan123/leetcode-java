package com.jackpan.leetcode.pivotIndex;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/18 13:00
 **/
public class Solution {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;
            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;

    }
}
