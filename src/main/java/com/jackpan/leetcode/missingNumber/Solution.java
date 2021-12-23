package com.jackpan.leetcode.missingNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {


    public int missingNumber(int[] nums) {
        int res = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return res;
    }


//    public int missingNumber(int[] nums) {
//        int length = nums.length;
//        int res = length;
//
//        Set<Integer> numberSet = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            numberSet.add(nums[i]);
//        }
//
//        for (int i = 0; i < length; i++) {
//            if (!numberSet.contains(i)) {
//                res = i;
//                break;
//            }
//        }
//
//        return res;
//    }
}
