https://leetcode.cn/problems/linked-list-cycle/


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}