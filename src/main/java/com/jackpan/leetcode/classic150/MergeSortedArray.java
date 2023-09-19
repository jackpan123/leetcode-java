package com.jackpan.leetcode.classic150;

/**
 * MergeSortedArray操作类
 *
 * @author JackPan
 * @date 2023/09/19 09:42
 **/
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int tail = m + n - 1;
        int curr;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                curr = nums2[p2--];
            } else if (p2 == -1) {
                curr = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                curr = nums1[p1--];
            } else {
                curr = nums2[p2--];
            }

            nums1[tail--] = curr;
        }
    }
}
