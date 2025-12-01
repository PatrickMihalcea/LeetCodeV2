
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

public class ReorderList_143 {
    public static void Solution(ListNode head) {
        ListNode reversedHead = head; 
        ListNode mid = head;
        ListNode next;

        while (reversedHead.next != null) {
            next = reversedHead.next;
            if (next.next != null) {
                reversedHead = next.next;
                mid = mid.next;
            }
            else {
                break;
            }
        }
        ListNode prev = mid;
        mid = mid.next;
        prev.next = null;
        prev = null;

        ListNode temp;
        while (mid != null) {
            temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }

        while (prev != null) {
            next = head.next;
            temp = prev.next;
            head.next = prev;
            prev.next = next;
            head = next;
            prev = temp;
        }
    }
}
