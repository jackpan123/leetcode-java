package com.jackpan.leetcode.twoSum;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/16 12:35
 **/
public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}