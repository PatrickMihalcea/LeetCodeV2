
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

public class MergeTwoSortedLists_21 {
    public static ListNode Solution(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head = null;
        if (list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        }
        else {
            head = list1;
            list1 = list1.next;
        }

        ListNode curr = head;

        while ((list1 != null) && (list2 != null)) {
            if (list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next;
            }
            else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        curr.next = list1 == null ? list2 : list1;

        return head;
    }

    public static ListNode SolutionRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = SolutionRecursive (list1.next, list2);
            return list1;
        } else {
            list2.next = SolutionRecursive(list1, list2.next);
            return list2;
        }
    }
}