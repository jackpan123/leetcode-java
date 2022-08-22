package com.jackpan.leetcode.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/22 18:57
 **/
public class Solution {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sKey = new HashMap<>();
        Map<Character, Character> tKey = new HashMap<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sKey.containsKey(sChar) && sKey.get(sChar) != tChar || tKey.containsKey(tChar) && tKey.get(tChar) != sChar) {
                return false;
            }

            sKey.put(sChar, tChar);
            tKey.put(tChar, sChar);
        }

        return true;
    }
}
