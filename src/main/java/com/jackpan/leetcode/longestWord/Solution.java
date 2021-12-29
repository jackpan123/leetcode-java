package com.jackpan.leetcode.longestWord;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public String longestWord(String[] words) {
        String ans = "";
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }

        for (String word : words) {
            boolean flag = false;
            if (word.length() > ans.length() || word.length() == ans.length() && word.compareTo(ans) < 0) {
                flag = true;
                for (int i = 1; i < word.length(); i++) {
                    if (!set.contains(word.substring(0, i))) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                ans = word;
            }
        }

        return ans;
    }
}
