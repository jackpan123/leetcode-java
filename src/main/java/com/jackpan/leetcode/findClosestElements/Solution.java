package com.jackpan.leetcode.findClosestElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/25 13:01
 **/
public class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        list.sort((o1, o2) -> {
            if (Math.abs(o1 - x) != Math.abs(o2 - x)) {
                return Math.abs(o1 - x) - Math.abs(o2 - x);
            } else {
                return o1 - o2;
            }
        });

        List<Integer> ans = list.subList(0, k);
        Collections.sort(ans);
        return ans;
    }

}
