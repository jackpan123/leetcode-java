package com.jackpan.algorithms.fundamentals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * FixedCapacityStack操作类
 * example to be or not to - be - - that - - - is
 * @author JackPan
 * @date 2022/10/14 13:15
 **/
public class FixedCapacityStack<Item> {

        // stack entries
        private Item[] a;

        // size
        private int N;

        public FixedCapacityStack(int cap) {
            a = (Item[]) new Object[cap];
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            a[N++] = item;
        }

        public Item pop() {
            Item item = a[--N];
            a[N] = null;
            return item;
        }

    public static void main(String[] args) {
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<>(100);
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
