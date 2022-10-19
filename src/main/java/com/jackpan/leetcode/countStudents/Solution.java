package com.jackpan.leetcode.countStudents;

import java.util.Arrays;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/19 13:06
 **/
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int s1 = Arrays.stream(students).sum();
        int s0 = students.length - s1;

        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 1 && s1 > 0) {
                s1--;
            } else if (sandwiches[i] == 0 && s0 > 0) {
                s0--;
            } else {
                break;
            }
        }

        return s0 + s1;
    }
}
