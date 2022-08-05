package com.jackpan.leetcode.addOneRow;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/05 13:06
 **/
public class Solution {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (root == null) {
            return null;
        }

        if (depth == 1) {
            return new TreeNode(val, root, null);
        }

        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            root.left = addOneRow(root.left, val, depth - 1);
            root.right = addOneRow(root.right, val, depth - 1);
        }

        return root;
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
