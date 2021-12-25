package com.jackpan.leetcode.findRelativeRanks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String[] findRelativeRanks(int[] score) {

        String[] ans = new String[score.length];
        Integer[] scoreCopy = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            scoreCopy[i] = score[i];
        }
        Arrays.sort(scoreCopy, Collections.reverseOrder());
        Map<Integer, String> sorted = new HashMap<>(scoreCopy.length);
        for (int i = 0; i < scoreCopy.length; i++) {
            if (i == 0) {
                sorted.put(scoreCopy[i], "Gold Medal");
            } else if (i == 1) {
                sorted.put(scoreCopy[i], "Silver Medal");
            } else if (i == 2) {
                sorted.put(scoreCopy[i], "Bronze Medal");
            } else {
                sorted.put(scoreCopy[i], String.valueOf(i + 1));
            }
        }

        for (int i = 0; i < score.length; i++) {
            ans[i] = sorted.get(score[i]);
        }
        return ans;
    }
}
