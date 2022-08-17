package com.jackpan.leetcode.reformat;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/11 12:46
 **/
public class Solution {


    public String reformat(String s) {
        char[] chars = s.toCharArray();
        int digitNumber = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digitNumber++;
            }
        }

        int charNumber = s.length() - digitNumber;
        if (Math.abs(digitNumber - charNumber) > 1) {
            return "";
        }

        boolean isDigitMuch = digitNumber > charNumber;

        for (int i = 0, j = 1; i < s.length(); i += 2) {
            if (Character.isDigit(chars[i]) != isDigitMuch) {
                while (Character.isDigit(chars[j]) != isDigitMuch) {
                    j += 2;
                }


                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }

        return new String(chars);

    }
}
