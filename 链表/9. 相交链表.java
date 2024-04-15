
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA,curB = headB;
        
        // 1. 计算长度
        int lengthA = 0,lengthB = 0;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }

        curA = headA;
        curB = headB;
        // 2. 让长的先走差距步
        int gap = 0;
        if (lengthA > lengthB) {
            gap = lengthA - lengthB;
            while(gap != 0) {
                curA = curA.next;
                gap--;
            }
        }else {
            gap = lengthB - lengthA;
            while(gap != 0) {
                curB = curB.next;
                gap--;
            }
        }

        // 3. 同时走, 判断哪个点相交
        while (curA != null && curB != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}