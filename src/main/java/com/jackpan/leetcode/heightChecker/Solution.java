package com.jackpan.leetcode.heightChecker;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/13 12:41
 **/
public class Solution {


    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                ans++;
            }
        }

        return ans;
    }
}
