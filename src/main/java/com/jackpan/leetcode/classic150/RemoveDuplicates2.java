package com.jackpan.leetcode.classic150;

/**
 * RemoveDuplicates2操作类
 *
 * @author JackPan
 * @date 2023/09/22 14:03
 **/
public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return len;
        }

        int fast = 2;
        int slow = 2;

        while (fast < len) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }
}
