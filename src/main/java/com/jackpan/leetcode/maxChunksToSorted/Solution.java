package com.jackpan.leetcode.maxChunksToSorted;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/14 12:59
 **/
public class Solution {
    public int maxChunksToSorted(int[] arr) {
        int m = 0, res = 0;
        for (int i = 0; i < arr.length; i++) {
            m = Math.max(m, arr[i]);
            if (m == i) {
                res++;
            }
        }
        return res;
    }
}
