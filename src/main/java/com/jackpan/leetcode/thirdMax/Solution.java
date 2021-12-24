package com.jackpan.leetcode.thirdMax;

import java.util.Arrays;

public class Solution {

    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        boolean find = false;
        for (int num : nums) {
            if (num > max) {
                max = num;
                find = true;
            }
        }


        if (find) {
            find = false;
            for (int num : nums) {
                if (num > max2 && num < max) {
                    max2 = num;
                    find = true;
                }
            }
        }

        if (find) {
            find = false;
            for (int num : nums) {
                if (num >= max3 && num < max2) {
                    max3 = num;
                    find = true;
                }
            }
        }
        return find ? max3 : max;

    }

//    public int thirdMax(int[] nums) {
//        Arrays.sort(nums);
//        int res = nums[nums.length - 1];
//        int random = 1;
//        if (nums.length >= 3) {
//            for (int i = nums.length - 2; i >= 0; i--) {
//                if (random == 3) {
//                    break;
//                } else {
//                    if (res != nums[i]) {
//                        random++;
//                        res = nums[i];
//                    }
//                }
//            }
//        }
//        return random < 3 ? nums[nums.length - 1] : res;
//    }
}
