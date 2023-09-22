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
        int p1 = 0;
        int p2 = 0;
        while (p1 < len && p2 < len) {
            if (p1 == p2) {
                p2++;
            } else if (nums[p1] == nums[p2]) {
                p2++;
            } else {
                nums[++p1] = nums[p2++];
            }
        }

        return p1 + 1;
    }
}
