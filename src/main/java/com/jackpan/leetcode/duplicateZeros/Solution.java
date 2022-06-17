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
        while (top < n) {
            i++;
            top++;
            if (arr[i] == 0) {
                top ++;
            }
        }

        int j = n - 1;
        if (top == n + 1) {
            arr[j] = 0;
            i--;
            j--;
        }

        while (j >= 0) {
            arr[j] = arr[i];
            j--;
            if (arr[i] == 0) {
                arr[j] = arr[i];
                j--;
            }
            i--;
        }
    }
}
