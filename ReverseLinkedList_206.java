
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

public class ReverseLinkedList_206 {
    public static ListNode Solution(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = null;
        ListNode tempNext = null;
        while (head.next != null) {
            tempNext = head.next;
            head.next = temp;
            temp = head;
            head = tempNext;
        }

        head.next = temp;
        return head;
    }
}


