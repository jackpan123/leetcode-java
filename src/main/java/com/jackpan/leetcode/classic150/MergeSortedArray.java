package com.jackpan.leetcode.classic150;

/**
 * MergeSortedArray操作类
 *
 * @author JackPan
 * @date 2023/09/19 09:42
 **/
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m > 0 && n == 0) {
                nums1[i] = nums1[m - 1];
                m--;
                continue;
            }

            if (n > 0 && m == 0) {
                nums1[i] = nums2[n - 1];
                n--;
                continue;
            }
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
    }
}
