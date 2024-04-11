https://leetcode.cn/problems/remove-linked-list-elements/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head,cur = head;
        while (cur != null) {
            if (cur.val == val) {
                // 头删判断
                if (head == cur) {
                    head = head.next;                   
                }else {
                    prev.next = cur.next;
                }
            }else {
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}