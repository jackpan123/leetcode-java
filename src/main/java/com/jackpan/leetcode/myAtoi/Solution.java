package com.jackpan.leetcode.myAtoi;

/**
 * 2022-02-02每日打卡第4题 目标（500题）
 */
public class Solution {

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        boolean blank = true;
        boolean arithmetic = false;
        boolean readNumber = false;
        boolean appendNumber = false;
        boolean appendArithmetic = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (blank) {
                if (!(aChar == ' ')) {
                    blank = false;
                    arithmetic = true;
                }
            }

            if (arithmetic) {
                if (aChar == '+' || aChar == '-') {
                    if (appendArithmetic) {
                        return 0;
                    }
                    if (aChar == '-') {
                        stringBuilder.append(aChar);
                    }
                    appendArithmetic = true;
                    continue;
                }

                arithmetic = false;
                readNumber = true;
            }

            if (readNumber) {
                if (aChar >= 48 && aChar <= 57) {
                    appendNumber = true;
                    stringBuilder.append(aChar);
                    long longAns = Long.parseLong(stringBuilder.toString());
                    if (longAns > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (longAns < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (!appendNumber) {
                        return 0;
                    } else {
                        break;
                    }
                }
            }

        }

        if (!appendNumber) {
            return 0;
        }

        long longAns = Long.parseLong(stringBuilder.toString());
        return (int)longAns;
    }


}
