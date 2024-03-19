package com.jackpan.leetcode.classic150;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * RemoveKdigits操作类
 *
 * @author JackPan
 * @date 2024/03/19 22:42
 **/
public class RemoveKdigits {


    public String removeKdigits(String num, int k) {

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peekLast() > digit) {
                stack.pollLast();
                k--;
            }

            stack.offerLast(digit);
        }

        for (int i = 0; i < k; i++) {
            stack.pollLast();
        }

        boolean leadingZero = true;
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {

            char digit = stack.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            result.append(digit);

        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
