package com.jackpan.leetcode.myCalendarThree;

import java.util.Map;
import java.util.TreeMap;

/**
 * 每日打卡第31题 目标（500题）
 * MyCalendarThree操作类
 * @author JackPan
 * @date 2022/06/06 10:34
 **/
class MyCalendarThree {
    private TreeMap<Integer, Integer> cnt;

    public MyCalendarThree() {
        cnt = new TreeMap<Integer, Integer>();
    }

    public int book(int start, int end) {
        int ans = 0;
        int maxBook = 0;
        cnt.put(start, cnt.getOrDefault(start, 0) + 1);
        cnt.put(end, cnt.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int freq = entry.getValue();
            maxBook += freq;
            ans = Math.max(maxBook, ans);
        }
        return ans;
    }
}

