package com.jackpan.algorithms.fundamentals;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Revese操作类
 *
 * @author JackPan
 * @date 2022/10/12 13:02
 **/
public class Revese {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readString());
        }

        for (String s : stack) {
            StdOut.println(s);
        }
    }

}
