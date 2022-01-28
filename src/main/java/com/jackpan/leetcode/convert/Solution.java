package com.jackpan.leetcode.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022-01-28每日打卡第2题 目标（500题）
 */
public class Solution {

    // 方法一 按行排序
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rowBuilder = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); ++i) {
            rowBuilder.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rowBuilder.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder stringBuilder : rowBuilder) {
            ans.append(stringBuilder);
        }

        return ans.toString();
    }
}
