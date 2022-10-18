package com.jackpan.leetcode.calPoints;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/18 13:13
 **/
class Solution {
    public int calPoints(String[] operations) {
        Deque<String> stack = new ArrayDeque<>();
        for (String operation : operations) {

            if ("+".equals(operation)) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.peek());

                int sum = num1 + num2;
                stack.push(String.valueOf(num1));
                stack.push(String.valueOf(sum));
            } else if ("D".equals(operation)) {
                stack.push(String.valueOf(Integer.parseInt(stack.peek()) * 2));
            } else if ("C".equals(operation)) {
                stack.pop();
            } else {
                stack.push(operation);
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += Integer.parseInt(stack.pop());
        }

        return ans;
    }
}