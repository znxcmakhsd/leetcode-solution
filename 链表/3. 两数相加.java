https://leetcode.cn/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        int carry = 0;
        for (int sum,val;
                l1 != null || l2 != null;
                l1 = l1 != null ? l1.next : null,
                l2 = l2 != null ? l2.next : null  
            ){
   
                sum = (l1 != null ? l1.val : 0) +  
                    (l2 != null ? l2.val : 0) + carry;
                carry  = sum / 10;
                val = sum % 10;
 
                ListNode node = new ListNode(val);
                if (head == null) {
                    head = node;
                    tail = head;
                }else {
                    tail.next = node;
                    tail = tail.next;
                }
            }
        if (carry == 1) {
            tail.next = new ListNode(1);
        }
        return head;
    }
}