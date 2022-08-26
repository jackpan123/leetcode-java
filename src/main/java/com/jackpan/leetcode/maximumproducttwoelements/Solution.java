package com.jackpan.leetcode.maximumproducttwoelements;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/26 22:48
 **/
public class Solution {

    public int maxProduct(int[] nums) {

        int max = 0;
        int secondMax = 0;

        for (int num : nums) {

            if (num > max) {
                if (max > secondMax) {
                    secondMax = max;
                }
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
