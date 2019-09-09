package com.jason.test;

import java.awt.*;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 14:04
 * @Modify 2019/9/9 14:04
 * @Version 1.0
 */
public class CircleQueue {

    private int front;
    private int rear;
    private int[] list;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public CircleQueue(int size) {
        size = size + 1;
        list = new int[size];
        front = 0;
        rear = 0;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            list[rear] = value;
            rear = (rear + 1) % list.length;
            return true;
        }
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            System.out.println("this element dequeue is " + list[front]);
            front = (front + 1) % list.length;
            return true;
        }
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        } else {
            return list[front];
        }
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return list[(rear - 1) % list.length];
        }
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return rear == front ? true : false;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return rear == (front + list.length - 1) % list.length ? true : false;
    }
}
