package com.jackpan.leetcode.digitCount;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/01/12 12:32
 **/
class Solution {
    public boolean digitCount(String num) {

        Map<Integer, Integer> h = new HashMap<>();
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            h.put(digit, h.getOrDefault(digit, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            int v = num.charAt(i) - '0';
            if (h.getOrDefault(i, 0) != 1) {
                return false;
            }
        }
        return true;
    }
}
