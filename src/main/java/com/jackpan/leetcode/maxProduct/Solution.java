package com.jackpan.leetcode.maxProduct;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jackpan
 * @version v1.0 2021/11/15 15:15
 */
class Solution {
    public int maxProduct(String[] words) {
        int maxSize = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];

                Set<Character> set = new HashSet<>();
                char[] char1 = word1.toCharArray();
                for (char aChar : char1) {
                    set.add(aChar);
                }

                char[] char2 = word2.toCharArray();
                boolean isSame = false;
                for (char aChar : char2) {
                    if (set.contains(aChar)) {
                        isSame = true;
                        break;
                    }
                }

                if (!isSame) {
                    maxSize = Math.max(word1.length() * word2.length(), maxSize);
                }

            }
        }
        return maxSize;
    }
}
