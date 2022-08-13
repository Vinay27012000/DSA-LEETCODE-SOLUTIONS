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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
		
        ListNode begin = null;
        ListNode prev = dummy;
        ListNode cur = head;
        
        for (int i = 1; i <= right; ++i) {
            if (i >= left) {
                if (i == left) begin = prev;
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        
        begin.next.next = cur;
        begin.next = prev;
        
        return dummy.next;
    }
}