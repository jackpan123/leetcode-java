package com.jackpan.leetcode.classic150;

/**
 * MyPow操作类
 *
 * @author JackPan
 * @date 2024/03/20 13:38
 **/
public class MyPow {

    public double myPow(double x, int n) {

        long N = n;

        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }


    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }

        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
