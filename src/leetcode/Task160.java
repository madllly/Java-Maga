package leetcode;

// +
// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class Task160 {
    
    // 160. Intersection of Two Linked Lists

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        // Проверяем, чтобы указатель показывал на один и тот же объект
        while (temp1 != temp2) {
            if (temp1 == null) temp1 = headB;
            else temp1 = temp1.next;

            if (temp2 == null) temp2 = headA;
            else temp2 = temp2.next;
        }

        return temp1;
    }
}
