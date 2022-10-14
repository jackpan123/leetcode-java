package com.jackpan.algorithms.fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * FixedCapacityStackOfStrings操作类
 * example to be or not to - be - - that - - - is
 * @author JackPan
 * @date 2022/10/14 13:11
 **/
public class FixedCapacityStackOfStrings {

    // stack entries
    private String[] a;

    // size
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
