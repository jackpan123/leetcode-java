package com.jackpan.leetcode.isValidSerialization;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/23 23:42
 **/
public class Solution {

    public boolean isValidSerialization(String preorder) {

        int i = 0;

        int len = preorder.length();

        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        while (i < len) {
            if (stack.isEmpty()) {
                return false;
            }

            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }
                i++;
            } else {

                while (i < len && preorder.charAt(i) != ',') {
                    i++;
                }

                int top = stack.pop() - 1;
                if (top > 0) {
                    stack.push(top);
                }

                stack.push(2);
            }
        }

        return stack.isEmpty();
    }
}
