package com.jackpan.leetcode.defangIPaddr;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/21 12:27
 **/
public class Solution {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
