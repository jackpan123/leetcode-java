package com.jackpan.leetcode.findLHS;

import java.util.HashMap;

/**
 * @author jackpan
 * @version v1.0 2021/11/20 23:08
 */
public class Solution {
    public int findLHS(int[] nums) {
        HashMap <Integer, Integer> cnt = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        for (int key : cnt.keySet()) {
            if (cnt.containsKey(key + 1)) {
                res = Math.max(res, cnt.get(key) + cnt.get(key + 1));
            }
        }
        return res;
    }
}
