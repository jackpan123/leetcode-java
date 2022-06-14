package com.jackpan.leetcode.findDiagonalOrder;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/14 14:12
 **/
public class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        // 行数
        int m = mat.length;
        // 列数
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int pos = 0;
        for(int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0) {
                // 从下往上
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while(x >= 0 && y < n) {
                    ans[pos] = mat[x][y];
                    x--;
                    y++;
                    pos++;
                }
            } else {
                // 从上往下
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while(x < m && y >= 0) {
                    ans[pos] = mat[x][y];
                    x++;
                    y--;
                    pos++;
                }
            }
        }

        return ans;
    }
}

