package com.jackpan.leetcode.intToRoman;

/**
 * 2022-02-03每日打卡第6题 目标（500题）
 */
public class Solution {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public String intToRoman(int num) {
        
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                stringBuilder.append(symbols[i]);
                num -= values[i];
            }
        }

        return stringBuilder.toString();
    }
}
