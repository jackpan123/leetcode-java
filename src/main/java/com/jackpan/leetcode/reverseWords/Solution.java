package com.jackpan.leetcode.reverseWords;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/16 13:33
 **/
public class Solution {


    public String reverseWords(String s) {
        String[] splitArr = s.split(" ");
        List<String> words = new ArrayList<String>();
        for (String string: splitArr) {
            int i = 0;
            int j = string.length() - 1;
            char[] array = string.toCharArray();
            while (i < j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            words.add(new String(array));
        }
        return String.join(" ", words);
    }
}
