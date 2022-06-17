package com.jackpan.leetcode.duplicateZeros;

import java.util.Stack;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/17 12:45
 **/
class Solution {
    public void duplicateZeros(int[] arr) {
        int i = -1;
        int top = 0;
        int n = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        while (top < n) {
            i++;
            top++;
            stack.push(arr[i]);
            if (arr[i] == 0) {
                stack.push(arr[i]);
                top ++;
            }
        }

        for (int j = n - 1; j >= 0; j++) {
            arr[j] = stack.pop();
        }
    }
}
