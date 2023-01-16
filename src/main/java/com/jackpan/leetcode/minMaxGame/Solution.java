package com.jackpan.leetcode.minMaxGame;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/01/16 12:57
 **/
public class Solution {
    public int minMaxGame(int[] nums) {

        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] newNumberArr = new int[n / 2];
        for (int i = 0; i < newNumberArr.length - 1; i++) {
            if (i % 2 == 0) {
                newNumberArr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNumberArr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }

        return minMaxGame(newNumberArr);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minMaxGame(new int[]{1,3,5,2,4,8,2,2}));
    }
}
