package com.jackpan.leetcode.isPowerOfThree;


/**
 *
 * 2022-03-11每日打卡第28题 目标（500题）
 */
public class Solution {

//    public boolean isPowerOfThree(int n) {
//        if (n == 3 || n == 1) {
//            return true;
//        }
//        if (n % 3 != 0 || n == 0) {
//            return false;
//        }
//
//        return isPowerOfThree(n / 3);
//    }


    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
