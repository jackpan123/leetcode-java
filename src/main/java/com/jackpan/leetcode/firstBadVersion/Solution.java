package com.jackpan.leetcode.firstBadVersion;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/03 13:10
 **/
public class Solution {
    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low < high) {
            int mid = ((high - low) >> 2) + low;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    private boolean isBadVersion(int index) {
        // Leet Code logical code
        return true;
    }
}
