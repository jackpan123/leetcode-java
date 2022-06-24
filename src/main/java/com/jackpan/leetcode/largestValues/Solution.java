package com.jackpan.leetcode.largestValues;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/24 12:32
 **/
public class Solution {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        dfs(ans, root, 0);
        return ans;
    }

    public void dfs(List<Integer> ans, TreeNode node, int height) {
        if (ans.size() == height) {
            ans.add(node.val);
        } else {
            ans.set(height, Math.max(node.val, ans.get(height)));
        }

        if (node.left != null) {
            dfs(ans, node.left, height + 1);
        }

        if (node.right != null) {
            dfs(ans, node.right, height + 1);
        }
    }

    public class TreeNode {
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
