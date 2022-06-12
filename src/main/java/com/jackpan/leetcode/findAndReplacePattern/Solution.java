package com.jackpan.leetcode.findAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * findAndReplacePattern操作类
 *
 * @author JackPan
 * @date 2022/06/12 21:56
 **/
public class Solution {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (matchPattern(word, pattern) && matchPattern(pattern, word)) {
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean matchPattern(String word, String pattern) {
        Map<Character, Character> mapping = new HashMap<Character, Character>();
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            char y = pattern.charAt(i);

            if (!mapping.containsKey(x)) {
                mapping.put(x, y);
            } else if (mapping.get(y) != x) {
                return false;
            }
        }

        return true;
    }
}
