
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

public class LinkedListCycle_141 {
    public static boolean Solution(ListNode head) {
        ListNode temp = new ListNode(-1);
        while (head != null) {
            if (head.next == temp) {
                return true;
            }
            ListNode next = head.next;
            head.next = temp;
            head = next;
        }

        return false;
    }
}
