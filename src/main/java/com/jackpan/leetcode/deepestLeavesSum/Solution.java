package com.jackpan.leetcode.deepestLeavesSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/17 12:44
 **/
public class Solution {


    private int maxDepth = 0;


    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return map.get(maxDepth);
    }

    public void dfs(TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            Integer sum = map.getOrDefault(depth, 0);
            sum += node.val;
            map.put(depth, sum);
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);

        if (depth > maxDepth) {
            maxDepth = depth;
        }

    }



    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
