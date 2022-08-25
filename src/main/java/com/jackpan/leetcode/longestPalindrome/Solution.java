package com.jackpan.leetcode.longestPalindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/25 22:21
 **/
public class Solution {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int ans = 0;
        int maxOdd = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value % 2 != 0) {
                maxOdd = value;
                ans += (value - 1);
            } else {
                ans += value;
            }
        }

        return maxOdd > 0 ? ans + 1 : ans;
    }
}
