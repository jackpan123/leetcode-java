package com.jackpan.leetcode.evaluate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/01/12 12:52
 **/
public class Solution {

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }

        StringBuilder key = new StringBuilder();
        StringBuilder res = new StringBuilder();
        boolean addKey =  false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                addKey = true;
            } else if (c == ')') {
                addKey = false;
                res.append(map.getOrDefault(key.toString(), "?"));
                key.setLength(0);
            } else if (addKey) {
                key.append(c);
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }
}
