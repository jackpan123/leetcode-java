package com.jackpan.leetcode.findPairs;

import java.util.*;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/16 12:40
 **/
public class Solution {
    public int findPairs(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            ans += binarySearch(map, nums, j, nums[j] - k);
        }
        return ans;
    }

    public int binarySearch(Map<Integer, Integer> map, int[] nums, int end, int target) {
        int ans = 0;

        int left = 0;
        int right = end;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid != end && nums[mid] == target) {
                Integer integer = map.get(target);
                if (integer == null) {
                    ans = 1;
                    map.put(target, end);
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return ans;
    }
}
