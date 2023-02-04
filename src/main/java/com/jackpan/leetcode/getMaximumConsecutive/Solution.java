package com.jackpan.leetcode.getMaximumConsecutive;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/04 21:49
 **/
public class Solution {

    public int getMaximumConsecutive(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > res) {
                break;
            }
            res += i;
        }
        return res;
    }

}
