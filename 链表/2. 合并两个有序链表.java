2. 合并两个有序链表
https://leetcode.cn/problems/merge-two-sorted-lists/description/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        // 谁小谁做头
        ListNode head = list1.val < list2.val ? list1 : list2;
        ListNode tail = head;
        ListNode c1 = head.next;
        ListNode c2 = list1 != head ? list1 : list2;
        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                tail.next = c1;
                c1 = c1.next;
            }else {
                tail.next = c2;
                c2 = c2.next;
            }
            tail = tail.next;
        }
        tail.next = c1 != null ? c1 : c2;
        return head;
    }
}