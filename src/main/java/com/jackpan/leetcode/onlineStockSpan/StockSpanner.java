package com.jackpan.leetcode.onlineStockSpan;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * StockSpanner操作类
 *
 * @author JackPan
 * @date 2022/10/21 12:58
 **/
class StockSpanner {

    Deque<int[]> stack;
    int index;
    public StockSpanner() {
        stack = new ArrayDeque<>();
        stack.push(new int[]{-1, Integer.MAX_VALUE});
        index = -1;
    }

    public int next(int price) {
        index++;
        while (price >= stack.peek()[1]) {
            stack.pop();
        }

        int ans = index - stack.peek()[0];
        stack.push(new int[]{index, price});
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
