package com.jackpan.leetcode.floodFill;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/30 12:58
 **/
public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int[] dx = new int[] {0, 1, -1, 0};
        int[] dy = new int[] {1, 0, 0, -1};


        int currentColor = image[sr][sc];
        if (currentColor == color) {
            return image;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {sr, sc});

        int xLen = image.length;
        int yLen = image[0].length;
        image[sr][sc] = color;
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < xLen && ny >= 0 && ny < yLen && image[nx][ny] == currentColor) {
                    image[nx][ny] = color;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return image;
    }
}
