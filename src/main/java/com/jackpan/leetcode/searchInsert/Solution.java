package com.jackpan.leetcode.searchInsert;

/**
 * Solution操作类
 * 每日打卡第33题 目标（500题）
 *
 * @author JackPan
 * @date 2022/06/09 13:41
 **/
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
