package com.jackpan.leetcode.peakIndexInMountainArray;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/11 16:55
 **/
public class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 2;
        int ans = 0;
        while (low <= high) {
            int mid = (high + low) >> 1;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
