package com.jackpan.leetcode.integerReplacement;

/**
 * @author jackpan
 * @version v1.0 2021/11/19 23:25
 */
public class Solution {
    public int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        }
        return 2 + Math.min(integerReplacement(n / 2), integerReplacement(n / 2 + 1));
    }
}
