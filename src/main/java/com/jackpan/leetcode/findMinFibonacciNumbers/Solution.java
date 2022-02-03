package com.jackpan.leetcode.findMinFibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022-02-03每日打卡第5题 目标（500题）
 */
public class Solution {

    public int findMinFibonacciNumbers(int k) {
        List<Integer> fNum = new ArrayList<>();
        int a = 1;
        int b = 1;
        fNum.add(a);
        fNum.add(b);
        while (a + b <= k) {
            int c = a + b;
            fNum.add(c);
            a = b;
            b = c;
        }

        int ans = 0;
        for (int i = fNum.size() - 1; i >= 0 && k > 0; --i) {
            Integer integer = fNum.get(i);
            if (integer <= k) {
                k -= integer;
                ans++;
            }
        }

        return ans;
    }

}
