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
    public boolean isPalindrome(ListNode head) {
        ListNode head2 = null;
        ListNode node,ptr=head;
        while(ptr!=null){
            node=new ListNode(ptr.val,head2);
            head2=node;
            ptr=ptr.next;
        }
        ListNode ptr2=head2;
        ptr=head;
        while(ptr2!=null){
            if(ptr2.val!=ptr.val)
                return false;
            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        return true;
    }
}