package com.jackpan.leetcode.maxLevelSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/07/31 15:41
 **/
public class Solution {

    private List<Integer> ans = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int res = 0;
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) > ans.get(res)) {
                res = i;
            }
        }
        return res + 1;
    }

    private void dfs(TreeNode node, Integer level) {
        if (level == ans.size()) {
            ans.add(node.val);
        } else {
            ans.set(level, node.val + ans.get(level));
        }

        if (node.left != null) {
            dfs(node.left, level + 1);
        }

        if (node.right != null) {
            dfs(node.right, level + 1);
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



