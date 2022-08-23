package com.jackpan.leetcode.stringMatching;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/23 12:40
 **/
public class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> res = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            String word = words[i];
            for (int j = 0; j < len; j++) {
                if (i != j && words[i].length() < words[j].length()) {
                    if (words[j].contains(words[i]) && !stringSet.contains(words[i])) {
                        res.add(words[i]);
                        stringSet.add(words[i]);
                    }
                }
            }
        }

        return res;
    }
}
