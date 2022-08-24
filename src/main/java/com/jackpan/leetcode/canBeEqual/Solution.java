package com.jackpan.leetcode.canBeEqual;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/24 12:36
 **/
public class Solution {

//    /**
//     * method one
//     * @param target
//     * @param arr
//     * @return
//     */
//    public boolean canBeEqual(int[] target, int[] arr) {
//        Arrays.sort(target);
//        Arrays.sort(arr);
//        for (int i = 0; i < target.length; i++) {
//            if (target[i] != arr[i]) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();

        for (int num : target) {
            targetMap.put(num, targetMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            arrMap.put(num, arrMap.getOrDefault(num, 0) + 1);
        }

        if (targetMap.size() != arrMap.size()) {
            return false;
        }


        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (targetMap.containsKey(key) && targetMap.get(key) != value) {
                return false;
            }
        }

        return true;
    }
}
