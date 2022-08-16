package com.jackpan.leetcode.designOrderedStream;

import java.util.ArrayList;
import java.util.List;

/**
 * OrderedStream操作类
 *
 * @author JackPan
 * @date 2022/08/16 08:48
 **/
public class OrderedStream {

    private String[] ans;

    private int ptr;

    public OrderedStream(int n) {
        ans = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        ans[idKey] = value;
        List<String> res = new ArrayList<>();
        while (ptr < ans.length && ans[ptr] != null) {
            res.add(ans[ptr]);
            ptr++;
        }


        return res;
    }
}
