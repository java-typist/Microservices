package com.jason.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    /**
     * 相关符号合法性检查，一下存在问题，记得判空
     *
     * @param s
     * @return
     */
    public Boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    list.push(ch);
                    break;
                case '}':
                    if (list.pop().equals('{')) {
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (list.pop().equals('[')) {
                        break;
                    } else {
                        return false;
                    }
                case ')':
                    if (list.pop().equals('(')) {
                        break;
                    } else {
                        return false;
                    }

            }
        }
        return true;
    }

    /**
     * 逆波兰表达式求解
     *
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            int result = 0;
            if (str.equals("+")) {
                result = stack.pop() + stack.pop();
            } else if (str.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                result = first - second;
            } else if (str.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                result = first / second;
            } else if (str.equals("*")) {
                result = stack.pop() * stack.pop();
            } else {
                result = Integer.valueOf(str);
            }
            stack.push(result);
        }
        return stack.pop();
    }
}
