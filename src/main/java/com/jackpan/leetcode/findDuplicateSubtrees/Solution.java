package com.jackpan.leetcode.findDuplicateSubtrees;

import java.util.*;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/09/05 12:37
 **/
public class Solution {

    Map<String, TreeNode> map = new HashMap<>();
    Set<TreeNode> nodeSet = new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(nodeSet);
    }

    public String dfs(TreeNode node) {
        if (node == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(node.val);
        sb.append("(");
        sb.append(dfs(node.left));
        sb.append(")(");
        sb.append(dfs(node.right));
        sb.append(")");

        String serial = sb.toString();
        if (map.containsKey(serial)) {
            nodeSet.add(map.get(serial));
        } else {
            map.put(serial, node);
        }

        return serial;
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
