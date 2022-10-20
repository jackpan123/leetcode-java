package com.jackpan.leetcode.kthGrammar;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/20 12:52
 **/
class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (k & 1) ^ 1 ^ kthGrammar(n - 1, (k + 1) / 2);
    }
}
