package com.jackpan.leetcode.subdomainVisits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/10/05 09:50
 **/
public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] numArr = domain.split(" ");
            String[] domainPart = numArr[1].split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int i = domainPart.length - 1; i >= 0; i--) {
                StringBuilder append;
                if (sb.length() > 0) {
                    append = new StringBuilder(domainPart[i]).append(".").append(sb);
                } else {
                    append = new StringBuilder(domainPart[i]);
                }
                sb = append;
                String currentDomain = append.toString();
                Integer domainNum = map.get(currentDomain);
                if (domainNum == null) {
                    map.put(currentDomain, Integer.valueOf(numArr[0]));
                } else {
                    map.put(currentDomain, Integer.parseInt(numArr[0]) + domainNum);
                }
            }
        }

        List<String> ans = new ArrayList<>();
        map.forEach((k, v) -> ans.add(v + " " + k));

        return ans;
    }
}
