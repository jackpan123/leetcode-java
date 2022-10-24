package com.jackpan.leetcode.flattenNestedListIterator;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 *
 * @author JackPan
 * @date 2022/10/24 13:31
 */
public class NestedIterator implements Iterator<Integer> {

    private Deque<Integer> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new LinkedList<>();
        dfs(nestedList);
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (int i=0; i < nestedList.size(); i++) {
            NestedInteger nestedInteger = nestedList.get(i);
            if (nestedInteger.isInteger()) {
                stack.push(nestedInteger.getInteger());
            } else {
                dfs(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return stack.pollLast();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
