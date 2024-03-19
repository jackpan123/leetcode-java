package com.jackpan.leetcode.classic150;

import edu.princeton.cs.algs4.In;

/**
 * RectangleFewestSquares操作类
 *
 * @author JackPan
 * @date 2023/11/18 20:34
 **/
public class RectangleFewestSquares {

    public int tilingRectangle(int n, int m) {

        int size = Math.min(n, m);

        int[] sizeArr = new int[n + 1];
        int[][] area = new int[n + 1][m + 1];
        for (int i = 1; i <= size; i++) {
            sizeArr[i] = i;
        }


        for (int i = 1; i < n + 1; i++) {
            area[i][1] = i;
        }

        for (int i = 1; i <= n; i++) {
            area[i][0] = 0;
        }
        for (int j = 1; j <= m; j++) {
            area[0][j] = 0;
        }
        for (int i = 1; i <= size; i++) {
            area[i][i] = 1;
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = size; k > 0; k--) {
                    if (k <= i && k <= j) {
                        int num = dfs(area, size, i, j);
                        min = Math.min(min, num);
                    }
                }
                area[i][j] = min;
            }
        }

        return area[n][m];

    }

    public int dfs(int[][] area, int k, int i, int j) {
        // 该规格 1块, 刚好填满， 剩余面积还能找到
        // 直接铺满
        int currentK = 2 * k;
        // 竖放直接铺满
        if (i - currentK == 0 && j - k == 0) {
            return 2;
        }

        // 横放直接铺满
        if (i - k == 0 && j - currentK == 0) {
            return 2;
        }
        if (i - k == 0 && j - k == 0) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        // n 侧铺满
        if (i - k == 0 && j - k > 0) {
            min = Math.min(min, area[i][j - k] + 1);
        }

        // m 侧铺满
        if (i - k > 0 && j - k == 0) {
            min = Math.min(min, area[i - k][j - k] + 1);
        }


        // n 侧竖放铺满
        if (i - currentK == 0 && j - k > 0) {
            min = Math.min(min, area[i][j - k] + 2);
        }
        // n 侧横放铺满
        if (i - k == 0 && j - currentK > 0) {
            min = Math.min(min, area[i][j - currentK] + 2);
        }

        // m 侧竖放铺满
        if (i - currentK > 0 && j - k == 0) {
            min = Math.min(min, area[i - currentK][j] + 2);

        }

        // m 侧横放铺满
        if (i - k > 0 && j - currentK == 0) {
            min = Math.min(min, area[i - k][j] + 2);
        }


        // m 和n都未铺满
        if (i - k > 0 && j - k > 0) {
            // dfs
            int num1 = dfs(area, k - 1, i - k, j) + 1;
            int num2 = dfs(area, k - 1, i, j - k) + 1;
            min = Math.min(min, num1);
            min = Math.min(min, num2);
        }

        // 竖放 m 和n都未铺满
        if (i - currentK > 0 && j - k > 0) {
            // dfs
            min = Math.min(min, dfs(area, k - 1, i - currentK, j) + 2);
            min = Math.min(min, dfs(area, k - 1, i, j - k) + 2);

        }

        // 横着放 m 和n都未铺满
        if (i - k > 0 && j - currentK > 0) {
            // dfs
            min = Math.min(min, dfs(area, k - 1, i - k, j - currentK) + 2);
            min = Math.min(min, dfs(area, k - 1, i, j - currentK) + 2);

        }

        return min;


    }

    public static void main(String[] args) {
        RectangleFewestSquares rectangleFewestSquares = new RectangleFewestSquares();
        System.out.println(rectangleFewestSquares.tilingRectangle(10, 11));
    }
}
