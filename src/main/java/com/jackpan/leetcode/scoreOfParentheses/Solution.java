package com.jackpan.leetcode.scoreOfParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/09 13:15
 **/
public class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(0);
            } else {
                int num = stack.pop();
                int sum = stack.pop() + Math.max(2 * num, 1);
                stack.push(sum);
            }
        }

        return stack.peek();
    }
}