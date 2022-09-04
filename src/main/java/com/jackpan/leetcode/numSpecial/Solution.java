package com.jackpan.leetcode.numSpecial;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/09/04 14:27
 **/
public class Solution {

        public int numSpecial(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;

            int[] mArr = new int[m];
            int[] nArr = new int[n];

            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mArr[i] += mat[i][j];
                    nArr[j] += mat[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1 && mArr[i] == 1 && nArr[j] == 1) {
                        ans++;
                    }
                }
            }

            return ans;
        }
}
