package com.jackpan.leetcode.sumSubarrayMins;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/28 14:06
 **/
public class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : i;
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : i;
            stack.push(i);
        }

        long ans = 0;
        final int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) (i - left[i] + 1) * (right[i] - i + 1) * arr[i]) % MOD;
        }
        return (int) ans;
    }
}
