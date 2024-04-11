https://leetcode.cn/problems/partition-list/

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode cur = head,next = null;
        ListNode lHead = null,lTail = null;
        ListNode rHead = null,rTail = null;
        while (cur != null) {
            next = cur.next;
            cur.next = null;
            if (cur.val < x) {
                if (lHead == null) {
                    lHead = cur;
                }else {
                    lTail.next = cur;
                }
                lTail = cur;
            }else {
                if (rHead == null) {
                   rHead = cur;
                }else {
                   rTail.next = cur;
                }
                rTail = cur;
            }
            cur = next;
        }
        if (lHead == null) {
            return rHead;
        }else {
            lTail.next = rHead;
            return lHead;
        }



    }
}