package com.jackpan.leetcode.widthOfBinaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/27 12:33
 **/
public class Solution {


    Map<Integer, Integer> min = new HashMap<Integer, Integer>();
    public int widthOfBinaryTree(TreeNode root) {
        return dfs(root, 1, 1);
    }

    public int dfs(TreeNode node, int depth, int index) {
        if (node == null) {
            return 0;
        }

        min.putIfAbsent(depth, index);

        return Math.max(index - min.get(depth) + 1, Math.max(dfs(node.left, depth + 1, index * 2),
                dfs(node.right, depth + 1, index * 2 + 1)));
    }


    static class TreeNode {
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
