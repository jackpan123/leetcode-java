package com.jackpan.leetcode.checkXMatrix;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/01/31 22:38
 **/
public class Solution {

    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || (i + j) == (n - 1)) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
