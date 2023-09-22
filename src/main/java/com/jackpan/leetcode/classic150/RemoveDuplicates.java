package com.jackpan.leetcode.classic150;

/**
 * RemoveDuplicates操作类
 *
 * @author JackPan
 * @date 2023/09/22 13:53
 **/
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        int fast = 1;
        int slow = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}
