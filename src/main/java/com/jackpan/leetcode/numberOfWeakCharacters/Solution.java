package com.jackpan.leetcode.numberOfWeakCharacters;

import java.util.Arrays;

/**
 * 2022-01-28每日打卡第1题 目标（500题）
 */
public class Solution {

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));

        int ans = 0;
        int maxDef = 0;
        for (int[] property : properties) {
            if (property[1] < maxDef) {
                ans++;
            } else {
                maxDef = property[1];
            }
        }

        return ans;
    }
}
