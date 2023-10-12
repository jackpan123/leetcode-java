package com.jackpan.leetcode.classic150;

/**
 * MinimumPathSum操作类
 *
 * @author JackPan
 * @date 2023/10/12 14:02
 **/
public class MinimumPathSum {

    /**
     * row  = 0; column > 0; dp[0][column] = dp[0][column - 1] + grid[0][ column - 1]
     * row > 0; column = 0; dp[row][0] = dp[row - 1][0] + grid[row - 1][0];
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] dp = new int[rows][columns];
        dp[0][0] = 0;
        for (int i = 1; i < columns; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i - 1];
        }

        for (int j = 1; j < rows; j++) {
            dp[j][0] = dp[j - 1][0] + grid[j - 1][0];
        }

        for (int j = 1; j < rows; j++) {
            for (int i = 1; i < columns; i++) {
                dp[j][i] = Math.min(dp[j][i - 1], dp[j - 1][i]) + grid[j][i];
            }
        }

        return dp[rows - 1][columns - 1];
    }
}
