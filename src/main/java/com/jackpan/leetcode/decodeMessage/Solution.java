package com.jackpan.leetcode.decodeMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/01 19:53
 **/
public class Solution {

    public String decodeMessage(String key, String message) {

        Map<Character, Character> map = new HashMap<>();
        char cur = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && !map.containsKey(c)) {
                map.put(c, cur);
                ++cur;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != ' ') {
                c = map.get(c);
            }
            sb.append(c);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String key = "the quick brown fox jumps over the lazy dog";
        String message ="vkbs bs t suepuv";
        System.out.println(solution.decodeMessage(key, message));
    }
}
