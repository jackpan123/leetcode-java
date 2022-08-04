package com.jackpan.leetcode.minSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/04 12:51
 **/
public class Solution {

    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        int curr = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i++) {
            curr += nums[i];
            ans.add(nums[i]);
            if (sum - curr < curr) {
                break;
            }
        }

        return ans;
    }
}
