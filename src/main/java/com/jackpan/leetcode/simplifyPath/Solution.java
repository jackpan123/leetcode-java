package com.jackpan.leetcode.simplifyPath;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/10 12:54
 **/
public class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : split) {
            if (!s.equals("") && !s.equals(".")) {
                if (s.equals("..")) {
                    stack.pop();
                } else {
                    stack.push(s);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append("/").append(stack.removeFirst());
        }

        return sb.toString();

    }
}
