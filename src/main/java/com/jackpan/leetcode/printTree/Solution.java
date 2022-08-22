package com.jackpan.leetcode.printTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/22 12:58
 **/
public class Solution {

    public List<List<String>> printTree(TreeNode root) {

        int height = calculateHeight(root);
        int m = height + 1;

        int n = (1 << (height + 1)) - 1;
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add("");
            }
            res.add(row);
        }

        dfs(res, root, 0, (n - 1) / 2, height);
        return res;
    }

    private void dfs(List<List<String>> res, TreeNode root, int r, int c, int height) {
        res.get(r).set(c, Integer.toString(root.val));
        if (root.left != null) {
            dfs(res, root.left, r + 1, c - (1 << (height - r - 1)), height);
        }
        if (root.right != null) {
            dfs(res, root.right, r + 1, c + (1 << (height - r - 1)), height);
        }
    }

    private int calculateHeight(TreeNode root) {
        int h = 0;
        if (root.left != null) {
            h = Math.max(h, calculateHeight(root.left) + 1);
        }

        if (root.right != null) {
            h = Math.max(h, calculateHeight(root.right) + 1);
        }
        return h;
    }

    public static class TreeNode {
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
