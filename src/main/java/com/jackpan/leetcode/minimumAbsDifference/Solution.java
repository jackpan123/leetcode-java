package com.jackpan.leetcode.minimumAbsDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/07/04 13:31
 **/
public class Solution {


    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                ans.clear();
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i]);
                ans.add(list);
            } else if (diff == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;
    }
}
