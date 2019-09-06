package com.jason.utils;

import javax.swing.text.Utilities;

/**
 * @Author Jason
 * @CreateTime 2019/9/3 8:23
 * @Modify 2019/9/3 8:23
 * @Version 1.0
 */
public class Util {

    public static int reverse(int x) {
        char[] value = String.valueOf(x).toCharArray();
        for (int i = 0; i < value.length / 2; i++) {

            char item = value[i];
            value[i] = value[value.length - i - 1];
            value[value.length - i - 1] = item;
        }
        String toTransfer = String.valueOf(value);
        if (toTransfer.contains("-")) {
            toTransfer = "-" + toTransfer.substring(0, toTransfer.length() - 1);
        }
        try {
            return Integer.valueOf(toTransfer).intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    public static int reverse2(int x) {
        int result = 0;
        while (x != 0) {
            int p = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && p > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && p < -8)) {
                return 0;
            }
            result = result * 10 + p;
        }
        return result;
    }

    public static void main(String[] args) {
        Util util = new Util();
        ListNode head = util.new ListNode(1);
        head.next = util.new ListNode(2);
        head.next.next = util.new ListNode(3);
        head.next.next.next = util.new ListNode(4);
        System.out.println(util.swapPairs(head));


    }

    class ListNode {
        int val;
        ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode current = new ListNode(0);
        current.next = head;
        ListNode f = current;
        while (current.next != null && current.next.next != null) {
            ListNode n = current.next;
            ListNode m = current.next.next;
            n.next = m.next;
            m.next = n;
            current.next = m;
            current = n;
        }
        return f.next;
    }
}
