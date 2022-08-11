package com.jackpan.leetcode.reformat;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/11 12:46
 **/
public class Solution {


    public String reformat(String s) {
        int charNumber = 0;
        int digitNumber = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (Character.isLetter(s.charAt(i))) {
                charNumber++;
            } else {
                digitNumber++;
            }
        }

        int diff = charNumber - digitNumber;

        if (Math.abs(diff) > 1) {
            return "";
        }

        boolean flag = digitNumber > charNumber;
        char[] arr = s.toCharArray();

        for (int i = 0, j = 1; i < s.length(); i += 2) {
            if (Character.isDigit(arr[i]) != flag) {
                while (Character.isDigit(arr[j]) != flag) {
                    j += 2;
                }
                swap(arr, i, j);
            }
        }
        return new String(arr);

    }

    public void swap(char[] arr, int i, int j) {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reformat("covid2019");
    }
}
