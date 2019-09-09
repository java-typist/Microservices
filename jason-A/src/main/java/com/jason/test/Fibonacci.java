package com.jason.test;

import java.util.HashMap;

/**
 * @Author Jason
 * @CreateTime 2019/9/9 8:22
 * @Modify 2019/9/9 8:22
 * @Version 1.0
 */
public class Fibonacci {

    public static HashMap<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            if (n < 2) {
                return n;
            } else {
                int item = fib(n - 1) + fib(n - 2);
                map.put(n, item);
                return item;
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(32));
    }
}
