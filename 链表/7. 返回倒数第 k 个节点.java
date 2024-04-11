https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/

class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode slow = head,fast = head;
        int n = k-1;
        // fast先走k-1步
        while(n != 0) {
            fast = fast.next;
            n--;
        }
        // 同时走
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;

    }
}