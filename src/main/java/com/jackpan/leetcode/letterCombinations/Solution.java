package com.jackpan.leetcode.letterCombinations;

import java.util.*;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/18 21:40
 **/
public class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (0 == digits.length()) {
            return ans;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(ans, map, digits, 0, new StringBuilder());
        return ans;
    }

    public void backtrack(List<String> ans, Map<Character, String> map, String digits, int index, StringBuilder stringBuilder) {
        if (index == digits.length()) {
            ans.add(stringBuilder.toString());
        } else {
            String letterString = map.get(digits.charAt(index));
            int n = letterString.length();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(letterString.charAt(i));
                backtrack(ans, map, digits, index + 1, stringBuilder);
                stringBuilder.deleteCharAt(index);
            }
        }
    }
}
