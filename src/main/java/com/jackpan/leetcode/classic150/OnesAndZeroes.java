package com.jackpan.leetcode.classic150;

import java.util.*;

/**
 * OnesAndZeroes操作类
 *
 * @author JackPan
 * @date 2023/11/01 23:31
 **/
public class OnesAndZeroes {




    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len + 1][m + 1][n + 1];
        for (int i = 1; i <= len; i++) {
            int[] zeroOnes = new int[2];
            String str = strs[i - 1];
            for (int j = 0; j < str.length(); j++) {
                zeroOnes[str.charAt(j) - '0']++;
            }

            int zerosNum = zeroOnes[0];
            int oneNum = zeroOnes[1];
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= zerosNum && k >= oneNum) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - zerosNum][k - oneNum] + 1);
                    }
                }
            }
        }

        return dp[len][m][n];
    }


    public static void main(String[] args) {
        OnesAndZeroes onesAndZeroes = new OnesAndZeroes();
        String[] str = new String[]{"0", "1101", "01", "00111", "1", "10010", "0", "0", "00", "1", "11", "0011"};
        System.out.println(onesAndZeroes.findMaxForm(str, 63, 36));
    }
}
