
public class RemoveNthNodeFromEndOfList_19 {
    public static ListNode Solution(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int separation = 0;
        int size = 0;

        while (fast != null) {
            fast = fast.next;
            separation++;
            if (separation == n+2) {
                slow = slow.next;
                separation--;
            }
            size++;
        }

        if ((head == slow) && (n == size)) {
            return head.next;
        }

        slow.next = slow.next.next;

        return head;
        
    }

    public static ListNode OptimalSolution(ListNode head, int n) { 
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
