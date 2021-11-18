package com.jackpan.leetcode.findTilt;

/**
 * @author jackpan
 * @version v1.0 2021/11/18 22:36
 */
public class Solution {

    int ans = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return 1;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int sumLeft = dfs(node.left);
        int sumRight = dfs(node.right);
        ans += Math.abs(sumLeft - sumRight);
        return sumLeft + sumRight + node.val;
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
