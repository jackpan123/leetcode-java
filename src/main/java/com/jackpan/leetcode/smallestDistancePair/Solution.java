package com.jackpan.leetcode.smallestDistancePair;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/15 13:38
 **/
public class Solution {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = nums[n - 1] - nums[0];
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int i = binarySearch(nums, j, nums[j] - mid);
                cnt += j - i;
            }
            if (cnt == k) {
                ans = mid;
                break;
            } else if (cnt > k) {
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }

        return ans;
    }

    public int binarySearch(int[] nums, int end, int target) {
        int left = 0;
        int right = end;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
