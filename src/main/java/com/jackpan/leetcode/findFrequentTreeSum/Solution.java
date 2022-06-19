package com.jackpan.leetcode.findFrequentTreeSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/19 22:06
 **/
public class Solution {

    private int maxCnt = 0;

    Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int sum = entry.getKey();
            int num = entry.getValue();
            if (maxCnt ==  num) {
                array.add(sum);
            }
        }

        int[] ans = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            ans[i] = array.get(i);
        }

        return ans;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int sum = node.val + dfs(node.left) + dfs(node.right);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        maxCnt = Math.max(maxCnt, map.get(sum));
        return sum;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
