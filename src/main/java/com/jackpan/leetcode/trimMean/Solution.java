package com.jackpan.leetcode.trimMean;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/09/14 09:56
 **/
public class Solution {

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int diff = (int) (n * 0.05);
        double sum = 0;
        for (int i = diff; i < n - diff; i++) {
            sum += arr[i];
        }

        return sum / (n - 2 * diff);
    }
}
