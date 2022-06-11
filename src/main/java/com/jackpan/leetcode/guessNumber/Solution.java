package com.jackpan.leetcode.guessNumber;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/11 10:34
 **/
public class Solution {
//    public int guessNumber(int n) {
//        int low = 1;
//        int high = n;
//        int ans = n;
//        while (low <= high) {
//            int mid = ((high - low) >> 2) + low ;
//            int result = guess(mid);
//            if (result == 0) {
//                ans = mid;
//                break;
//            } else if (result > 0) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//
//        return ans;
//    }

    // 优化
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = ((high - low) >> 2) + low ;
            if (guess(mid) <= 0) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int guess(int num) {
        return 0;
    }
}
