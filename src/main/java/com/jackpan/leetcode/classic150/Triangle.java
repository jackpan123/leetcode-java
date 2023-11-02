package com.jackpan.leetcode.classic150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Triangle操作类
 *
 * @author JackPan
 * @date 2023/10/31 23:21
 **/
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();

        Integer[][] dp = new Integer[n][m];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            int len = triangle.get(i).size();
            for (int j = 0; j < len; j++) {
                Integer first = dp[i - 1][j];

                if (first == null) {
                    first = Integer.MAX_VALUE;
                }

                int min = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    Integer second = dp[i - 1][j - 1];
                    if (second != null) {
                        min = second;
                    }
                }
                min = Math.min(first, min);

                dp[i][j] = min + triangle.get(i).get(j);
            }
        }

        int res = dp[n - 1][0];
        for (int i = 1; i < m; i++) {
            if (dp[n - 1][i] != null) {
                res = Math.min(res, dp[n - 1][i]);
            }
        }

        return res;

    }



    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(-1));
        list.add(Arrays.asList(2,3));
        list.add(Arrays.asList(1,-1,-3));
        System.out.println(new Triangle().minimumTotal(list));
    }
}
