package com.jackpan.leetcode.deleteNode;

/**
 * 每日打卡第30题 目标（500题）
 *
 * @author JackPan
 * @date 2022/06/02 20:16
 **/
public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode p = root;
        TreeNode pp = null;
        while (p != null && p.val != key) {
            pp = p;
            if (key > p.val) {
                p = p.right;
            } else {
                p = p.left;
            }
        }

        if (p == null) {
            return root;
        }

        if (p.left != null && p.right != null) {
            TreeNode minP = p.right;
            TreeNode minPP = p;

            while (minP.left != null) {
                minPP = minP;
                minP = minPP.left;
            }

            p.val = minP.val;
            p = minP;
            pp = minPP;
        }

        TreeNode child = null;
        if (p.left != null) {
            child = p.left;
        } else if (p.right != null) {
            child = p.right;
        }

        if (pp == null) {
            root = child;
        } else if (pp.left == p) {
            pp.left = child;
        } else {
            pp.right = child;
        }

        return root;
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
