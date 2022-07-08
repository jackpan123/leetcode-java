package com.jackpan.leetcode.minCostToMoveChips;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/07/08 12:36
 **/
public class Solution {

    public int minCostToMoveChips(int[] position) {
        int evenNum = 0;
        int oddNum = 0;

        for (int p : position) {
            if ((p & 1) != 0) {
                oddNum++;
            } else {
                evenNum++;
            }
        }

        return Math.min(evenNum, oddNum);
    }
}
