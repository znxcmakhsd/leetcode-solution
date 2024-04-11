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
    public ListNode reverseList(ListNode head) {
       ListNode prev = null,next = null;
       while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
       }
       return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // 1. 找到中心节点
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. 反转链表
        ListNode newHead = reverseList(slow);
        
        // 3. 判断是否回文
        while (head.next != null) {
            if (head.val != newHead.val) {
                return false;
            }else {
                head = head.next;
                newHead = newHead.next;
            }
        }
        return true;
    }
}