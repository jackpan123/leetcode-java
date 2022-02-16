package com.jackpan.leetcode.luckyNumbers;

import java.util.*;

/**
 * 2022-02-15每日打卡第14题 目标（500题）
 */
public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] min = new int[m];
        Arrays.fill(min, Integer.MAX_VALUE);
        int[] max = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min[i] = Math.min(min[i], matrix[i][j]);
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }

        Set<Integer> maxSet = new HashSet<>(n);
        for (int i = 0; i < max.length; i++) {
            maxSet.add(max[i]);
        }

        for (int i = 0; i < min.length; i++) {
            if (maxSet.contains(min[i])) {
                ans.add(min[i]);
            }
        }

        return ans;
    }

}
