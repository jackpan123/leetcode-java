package com.jackpan.leetcode.calculate;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 2022-02-27每日打卡第25题 目标（500题）
 */
public class Solution {

    Map<Character, Integer> map = new HashMap<Character, Integer>(){{
        put('-', 1);
        put('+', 1);
        put('*', 2);
        put('/', 2);
    }};
    public int calculate(String s) {
        s = s.replaceAll(" ", "");
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(0);
        Deque<Character> operators = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if (Character.isDigit(character)) {
                int j = i;
                int sum = 0;
                while (j < chars.length && Character.isDigit(chars[j])) {
                    sum = sum * 10 + (chars[j] - '0');
                    j++;
                }
                nums.addLast(sum);
                i = j - 1;
            } else {

                while (!operators.isEmpty()) {
                    char prev = operators.peekLast();
                    if (map.get(prev) >= map.get(character)) {
                        calc(nums, operators);
                    } else {
                        break;
                    }
                }

                operators.addLast(character);
            }
        }

        while (!operators.isEmpty()) {
            calc(nums, operators);
        }

        return nums.peekLast();
    }

    private void calc(Deque<Integer> nums, Deque<Character> operators) {
        if (nums.isEmpty() || nums.size() < 2) {
            return;
        }
        if (operators.isEmpty()) {
            return;
        }

        Integer b = nums.pollLast();
        Integer a = nums.pollLast();
        Character pop = operators.pollLast();
        switch (pop) {
            case '+':
                nums.addLast(a + b);
                break;
            case '-':
                nums.addLast(a - b);
                break;
            case '*':
                nums.addLast(a * b);
                break;
            default :
                nums.addLast(a / b);
                break;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int calculate = solution.calculate("0-2147483647");
        System.out.println();
    }


}

