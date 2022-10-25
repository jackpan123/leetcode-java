package com.jackpan.leetcode.shortestBridge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/25 13:24
 **/
public class Solution {
    public int shortestBridge(int[][] grid) {

        int n = grid.length;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0 , -1, 0};
        List<int[]> island = new ArrayList<int[]>();
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = -1;
                    queue.offer(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] pos = queue.poll();
                        island.add(pos);

                        for (int x = 0; x < 4; x++) {
                            int nx = pos[0] + dx[x];
                            int ny = pos[1] + dy[x];

                            if (nx >= 0 && ny >= 0 && nx < n && ny < n && grid[nx][ny] == 1) {
                                grid[nx][ny] = -1;
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }

                    for (int[] arr : island) {
                        queue.offer(arr);
                    }

                    int step = 0;
                    while (!queue.isEmpty()) {
                        int len = queue.size();
                        for (int k = 0; k < len; k++) {
                            int[] pos = queue.poll();
                            for (int x = 0; x < 4; x++) {
                                int nx = pos[0] + dx[x];
                                int ny = pos[1] + dy[x];
                                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                    if (grid[nx][ny] == 0) {
                                        grid[nx][ny] = -1;
                                        queue.offer(new int[]{nx, ny});
                                    } else if (grid[nx][ny] == 1) {
                                        return step;
                                    }
                                }

                            }
                        }
                        step++;
                    }
                }
            }
        }

        return 0;
    }
}
