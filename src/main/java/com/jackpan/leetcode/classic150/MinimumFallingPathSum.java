package com.jackpan.leetcode.classic150;

/**
 * MinimumFallingPathSum操作类
 *
 * @author JackPan
 * @date 2023/10/26 08:58
 **/
public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {

        int len = matrix.length;
        int[][] dp = new int[len][len];

        for (int i = 0; i < matrix[0].length; i++) {
            dp[0][i] = matrix[0][i];
        }

        for (int row = 1; row < len; row++) {
            for (int col = 0; col < len; col++) {
                int min = dp[row - 1][col];
                if (col - 1 >= 0) {
                    min = Math.min(min, dp[row - 1][col - 1]);
                }
                if (col + 1 < len) {
                    min = Math.min(min, dp[row - 1][col + 1]);
                }
                dp[row][col] = min + matrix[row][col];
            }
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < dp[len - 1].length; i++) {
            res = Math.min(res, dp[len - 1][i]);
        }

        return res;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2,1,3},{6,5,4},{7,8,9}};
        MinimumFallingPathSum obj = new MinimumFallingPathSum();
        obj.minFallingPathSum(matrix);

    }
}
