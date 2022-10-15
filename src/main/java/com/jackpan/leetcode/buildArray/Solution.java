package com.jackpan.leetcode.buildArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/15 16:35
 **/
public class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> ans = new ArrayList<>();
        int j = 0;
        int len = target.length;
        for (int i = 1; i <= n; i++) {
            if (j >= len) {
                break;
            }
            if (target[j] == i) {
                ans.add("Push");
                j++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
        }

        return ans;
    }
}