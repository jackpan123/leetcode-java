package com.jackpan.leetcode.findBottomLeftValue;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/06/22 12:46
 **/
public class Solution {

    int curVal = 0;
    int curHeight = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return curVal;
    }

    public void dfs(TreeNode node, int height) {
        if (node == null) {
            return;
        }

        height++;
        dfs(node.left, height);
        dfs(node.right, height);
        if (height > curHeight) {
            curHeight = height;
            curVal = node.val;
        }

    }

    public class TreeNode {
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
