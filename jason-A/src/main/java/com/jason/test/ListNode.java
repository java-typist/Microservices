package com.jason.test;


/**
 * @Author Jason
 * @CreateTime 2019/9/6 16:13
 * @Modify 2019/9/6 16:13
 * @Version 1.0
 */
public class ListNode {
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

    /**
     * 两两相邻互换
     * @param head
     * @return
     */
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

    public ListNode reverse(ListNode head){
        ListNode pre = new ListNode(0);
        ListNode current = pre;
        while (head != null){
            current = head;
            head = head.next;
            current.next = pre.next;
            pre.next = current;
        }
        return pre.next;
    }
}
