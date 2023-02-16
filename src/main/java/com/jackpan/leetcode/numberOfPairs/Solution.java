package com.jackpan.leetcode.numberOfPairs;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2023/02/16 21:27
 **/
public class Solution {

    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> numAmountMap = new HashMap<>();

        for (int num : nums) {
            numAmountMap.put(num, numAmountMap.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];

        numAmountMap.forEach((num, amount) -> {
            if (amount > 1) {
                ans[0] += amount / 2;
                if (amount % 2 != 0) {
                    ans[1] += 1;
                }
            } else {
                ans[1] += amount;
            }
        });

        return ans;
    }
}
