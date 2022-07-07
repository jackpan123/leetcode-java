package com.jackpan.leetcode.replaceWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/07/07 12:46
 **/
public class Solution {

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String prefix : dictionary) {
            map.put(prefix, prefix.length());
        }

        List<String> ans = new ArrayList<>();
        for (String word : words) {
            int min = Integer.MAX_VALUE;
            String prefix = null;
            for (String key : map.keySet()) {
                if (word.startsWith(key)) {
                    if (map.get(key) < min) {
                        min = map.get(key);
                        prefix = key;
                    }
                }
            }

            if (prefix != null) {
                ans.add(prefix);
            } else {
                ans.add(word);
            }
        }

        return String.join(" ", ans);
    }
}
