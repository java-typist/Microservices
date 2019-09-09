package com.jason.test;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 15:12
 * @Modify 2019/9/9 15:12
 * @Version 1.0
 */
public class MinStack {
    private int top = 0;
    private int[] list = new int[1000];

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        if (top != list.length - 1) {
            top++;
            System.out.println(list[top]);
        }
    }

    public void pop() {
        if (top != -1) {
            System.out.println(list[top]);
            top--;
        }
    }

    public int top() {
        if (top == -1) {
            return -1;
        } else {
            return list[top];
        }
    }

    public int getMin() {
        int item = top;
        int result = list[item];
        while (item != -1) {
            if (result < list[item]) {
                result = list[item];
            }
            item--;
        }
        return result;
    }
}
