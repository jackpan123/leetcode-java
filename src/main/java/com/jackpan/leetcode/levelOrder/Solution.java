package com.jackpan.leetcode.levelOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/26 23:14
 **/
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, root, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> list, TreeNode node, Integer layerNumber) {

        if (node == null) {
            return;
        }


        List<Integer> layerList = new ArrayList<>();
        if (list.size() > layerNumber) {
            layerList = list.get(layerNumber);
        } else {
            list.add(layerNumber, layerList);
        }
        layerList.add(node.val);
        dfs(list, node.left, layerNumber + 1);
        dfs(list, node.right, layerNumber + 1);
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
