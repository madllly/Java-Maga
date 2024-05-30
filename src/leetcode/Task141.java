package leetcode;
// +
// https://leetcode.com/problems/linked-list-cycle/description/

public class Task141 {

    // 141. Linked List Cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;        
    }
}
