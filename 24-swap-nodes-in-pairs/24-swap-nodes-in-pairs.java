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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr != null && next != null) {
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
            curr = curr.next;
            if (curr != null) next = curr.next;
        }
        return res.next;
    }
}