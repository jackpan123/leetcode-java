package com.jackpan.leetcode.numIslands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/31 13:11
 **/
public class Solution {

    public int numIslands(char[][] grid) {
        int ans = 0;
        if (grid == null || grid.length == 0) {
            return ans;
        }
        int[] dx = new int[]{0, 1, -1, 0};
        int[] dy = new int[]{1, 0, 0, -1};

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[] {i, j});
                    grid[i][j] = '0';

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        for (int z = 0; z < 4; z++) {
                            int x = cell[0] + dx[z];
                            int y = cell[1] + dy[z];
                            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1') {
                                grid[x][y] = '0';
                                queue.offer(new int[] {x, y});
                            }
                        }
                    }
                }
            }
        }

        return ans;


    }
}
