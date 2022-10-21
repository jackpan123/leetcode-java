package com.jackpan.algorithms.fundamentals;

/**
 * Stack操作类
 *
 * @author JackPan
 * @date 2022/10/21 13:18
 **/
public class Stack<Item> {

    private Node first;

    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
