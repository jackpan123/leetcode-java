package com.jackpan.leetcode.alertNames;

import java.util.*;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/07 10:04
 **/
public class Solution {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            map.putIfAbsent(name, new ArrayList<>());
            int hour = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
            int minute = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
            map.get(name).add(hour * 60 + minute);
        }

        List<String> ans = new ArrayList<>();
        for (String name : map.keySet()) {
            List<Integer> list = map.get(name);
            Collections.sort(list);
            for (int i = 2; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 2) <= 60) {
                    ans.add(name);
                    break;
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
