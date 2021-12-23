package com.jackpan.leetcode.missingNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int missingNumber(int[] nums) {
        int length = nums.length;
        int res = length;

        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numberSet.add(nums[i]);
        }

        for (int i = 0; i < length; i++) {
            if (!numberSet.contains(i)) {
                res = i;
                break;
            }
        }

        return res;
    }
}
