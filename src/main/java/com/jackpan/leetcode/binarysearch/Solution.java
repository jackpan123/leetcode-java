package com.jackpan.leetcode.binarysearch;

/**
 * Solution操作类
 * 每日打卡第34题 目标（500题）
 *
 * @author JackPan
 * @date 2022/06/10 13:32
 **/
public class Solution {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = ((high - low) >> 2) + low;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;

    }
}
