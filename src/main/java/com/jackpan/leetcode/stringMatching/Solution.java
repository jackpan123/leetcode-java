package com.jackpan.leetcode.stringMatching;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/23 12:40
 **/
public class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> res = new ArrayList<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }

        return res;
    }

}
