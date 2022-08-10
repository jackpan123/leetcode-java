package com.jackpan.leetcode.sortedSquares;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/08 22:24
 **/
public class Solution {

//    public int[] sortedSquares(int[] nums) {
//
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i] = nums[i] * nums[i];
//        }
//
//        Arrays.sort(ans);
//
//        return ans;
//    }


    /**
     * 双指针
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int negative = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }

        int[] ans = new int[n];

        int i = negative;
        int j = negative + 1;
        int index = 0;
        while (i >=0 || j < n) {
            if (i < 0) {
                ans[index] = nums[j] * nums[j];
                j++;
            } else if (j >= n) {
                ans[index] = nums[i] * nums[i];
                i--;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[index] = nums[i] * nums[i];
                i--;
            } else {
                ans[index] = nums[j] * nums[j];
                j++;
            }
            index++;
        }
        return ans;
    }
}
