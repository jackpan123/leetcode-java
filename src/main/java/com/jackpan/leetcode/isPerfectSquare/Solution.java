package com.jackpan.leetcode.isPerfectSquare;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/12 20:57
 **/
public class Solution {

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
