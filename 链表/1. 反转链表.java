// 1. 反转单链表
https://leetcode.cn/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next = null,prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

// 反转双链表
public class Test {

    // 双向链表节点结构
    static class ListNode {
        public ListNode last;
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public static ListNode reverseDoubleList(ListNode head) {
            ListNode prev = null,next = null;
            while (head != null) {
                next = head.next;
                head.last = next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }

    }
}

