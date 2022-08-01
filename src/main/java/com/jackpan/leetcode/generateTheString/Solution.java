package com.jackpan.leetcode.generateTheString;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/01 12:42
 **/
public class Solution {

    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                s.append("a");
            }
            return s.toString();
        }

        for (int i = 0; i < n - 1; i++) {
            s.append("a");
        }
        s.append("b");
        return s.toString();
    }
}
