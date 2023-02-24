package com.jackpan.leetcode.minimumOperations;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/24 12:27
 **/
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        return set.size();
    }
}
