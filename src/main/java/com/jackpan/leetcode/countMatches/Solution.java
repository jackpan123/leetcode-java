package com.jackpan.leetcode.countMatches;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/31 22:29
 **/
public class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        int index = map.get(ruleKey);
        int ans = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                ans++;
            }
        }

        return ans;
    }
}
