package com.jackpan.leetcode.findLUSlength;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/27 12:54
 **/
public class Solution {

    public int findLUSlength(String[] strs) {
        int ans = -1;
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            boolean check = true;

            for (int j = 0; j < n; j++) {
                if (i != j && isSubSequence(strs[i], strs[j])) {
                    check = false;
                    break;
                }
            }

            if (check) {
                ans = Math.max(ans, strs[i].length());
            }
        }

        return ans;
    }

    private boolean isSubSequence(String stri, String strj) {
        int pti = 0;
        int ptj = 0;
        while (pti < stri.length() && ptj < strj.length()) {
            if (stri.charAt(pti) == strj.charAt(ptj)) {
                pti++;
            }

            ptj++;
        }

        return pti == stri.length();
    }


}
