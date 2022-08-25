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


    public int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if(arr[mid] == x){
                ans = mid;
                break;
            }else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int i = solution.binarySearch(arr, 3);
        System.out.println();
    }

}
