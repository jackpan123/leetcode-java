package com.jackpan.leetcode.longestCommonPrefix;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/20 22:18
 **/
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null && strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
        }

        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < min && str1.charAt(index) == (str2.charAt(index))) {
            index++;
        }

        return str1.substring(0, index);
    }
}
