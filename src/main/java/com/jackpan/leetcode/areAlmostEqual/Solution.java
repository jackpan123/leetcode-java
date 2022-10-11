package com.jackpan.leetcode.areAlmostEqual;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/11 12:57
 **/
public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> diff = new ArrayList<>();
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diff.size() >= 2) {
                    return false;
                }

                diff.add(i);
            }
        }

        if (diff.isEmpty()) {
            return true;
        }

        if (diff.size() != 2) {
            return false;
        }

        return s1.charAt(diff.get(0)) == s2.charAt(diff.get(1)) && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
    }
}
