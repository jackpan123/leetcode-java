package com.jackpan.leetcode.designCircularDeque;

/**
 * MyCircularDeque操作类
 *
 * @author JackPan
 * @date 2022/08/15 12:40
 **/
public class MyCircularDeque {

    private int[] array;

    private int head;

    private int tail;

    private int capacity = 0;

    public MyCircularDeque(int k) {
        capacity = k + 1;
        array = new int[capacity];
        head = 0;
        tail = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        head = (head - 1 + capacity) % capacity;
        array[head] = value;
        return true;

    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        array[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + capacity) % capacity;
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return array[head];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return array[(tail - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }
}
/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */