package com.jackpan.leetcode.advantageCount;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/08 13:09
 **/
class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {

        int len = nums1.length;
        Integer[] nums1Index = new Integer[len];
        Integer[] nums2Index = new Integer[len];

        for (int i = 0; i < len; i++) {
            nums1Index[i] = i;
            nums2Index[i] = i;
        }

        Arrays.sort(nums1Index, (i, j) -> nums1[i] - nums1[j]);
        Arrays.sort(nums2Index, (i, j) -> nums2[i] - nums2[j]);

        int[] ans = new int[len];
        int left = 0;
        int right = len - 1;
        for (int i = 0; i < len; i++) {
            if (nums1[nums1Index[i]] > nums2[nums2Index[left]]) {
                ans[nums2Index[left]] = nums1[nums1Index[i]];
                left++;
            } else {
                ans[nums2Index[right]] = nums1[nums1Index[i]];
                right--;
            }
        }

        return ans;
    }
}
