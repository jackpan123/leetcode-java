package com.jackpan.leetcode.preorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution操作类
 *
 * @author JackPan
 * @date 2022/08/26 13:02
 **/
public class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }


        dfs(ans, root);

        return ans;


    }

    public void dfs(List<Integer> list, Node node) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        for (Node child : node.children) {
            dfs(list, child);
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
