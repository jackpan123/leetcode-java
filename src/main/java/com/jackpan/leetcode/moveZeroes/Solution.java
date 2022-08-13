package com.jackpan.leetcode.moveZeroes;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/13 23:16
 **/
public class Solution {

    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 0;

        while (j < n) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
