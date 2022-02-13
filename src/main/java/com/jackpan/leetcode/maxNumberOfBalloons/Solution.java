package com.jackpan.leetcode.maxNumberOfBalloons;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022-02-13每日打卡第12题 目标（500题）
 */
public class Solution {

    private Map<Character, Integer> map = new HashMap<>();

    public Solution() {
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
    }
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        for (char c : text.toCharArray()) {
            Integer integer = map.get(c);
            if (integer != null) {
                map.put(c, integer+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character k = entry.getKey();
            Integer v = entry.getValue();
            if (k == 'l' || k == 'o') {
                v = v/2;
            }
            ans = Math.min(ans, v);

        }

        return ans;
    }
}
