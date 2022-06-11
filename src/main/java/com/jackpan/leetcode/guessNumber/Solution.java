package com.jackpan.leetcode.guessNumber;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/11 10:34
 **/
public class Solution {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int ans = n;
        while (low <= high) {
            int mid = ((high - low) >> 2) + low ;
            int result = guess(mid);
            if (result == 0) {
                ans = mid;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int guess(int num) {
        return 0;
    }
}
