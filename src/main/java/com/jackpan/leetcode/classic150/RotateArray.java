package com.jackpan.leetcode.classic150;

/**
 * RotateArray操作类
 *
 * @author JackPan
 * @date 2023/10/10 10:05
 **/
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length - 1;
        reverse(nums, 0, len);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len);
    }


    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
