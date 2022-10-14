package com.jackpan.leetcode.binarySearchTreeIterator;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * BSTIterator操作类
 *
 * @author JackPan
 * @date 2022/10/14 12:56
 **/
public class BSTIterator {

    Deque<TreeNode> array = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        dfsLeft(root);
    }

    void dfsLeft(TreeNode root) {
        while (root != null) {
            array.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode node = array.poll();
        int ans = node.val;

        TreeNode right = node.right;
        dfsLeft(right);
        return ans;
    }

    public boolean hasNext() {
        return !array.isEmpty();
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
