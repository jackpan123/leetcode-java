package com.jackpan.leetcode.classic150;

/**
 * MaximalSquare操作类
 *
 * @author JackPan
 * @date 2023/11/04 16:19
 **/
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {

        int max = 0;

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i] - '0';
            max = Math.max(dp[0][i], max);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 < 0) {
                    dp[i][j] = matrix[i][j] - '0';
                    max = Math.max(max, dp[i][j]);
                } else {
                    if (dp[i - 1][j] > 0 && dp[i][j - 1] > 0
                            && dp[i - 1][j - 1] > 0 && matrix[i][j] == '1') {
                        int min = dp[i - 1][j];
                        min = Math.min(min, dp[i][j - 1]);
                        min = Math.min(min, dp[i - 1][j - 1]);
                        min = sqrt(min);
                        dp[i][j] = (min + 1) * (min + 1);
                        max = Math.max(max, dp[i][j]);
                    } else {
                        dp[i][j] = matrix[i][j] - '0';
                        max = Math.max(max, dp[i][j]);
                    }

                }
            }
        }

        return max;
    }


    public int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long start = 1;
        long end = x;
        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return (int) result;
    }
}
