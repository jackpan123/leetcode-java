package com.jackpan.leetcode.asteroidCollision;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/07/13 12:42
 **/
public class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int asteroid : asteroids) {

            boolean alive = true;
            while (alive && asteroid < 0 && !stack.isEmpty() && stack.peek() > 0) {
                alive = stack.peek() < -asteroid;
                if (stack.peek() <= -asteroid) {
                    stack.pop();
                }
            }

            if (alive) {
                stack.push(asteroid);
            }

        }

        int size = stack.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}


