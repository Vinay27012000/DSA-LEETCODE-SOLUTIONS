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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp.next != null){
            temp = temp.next;
            length++;
        }
         int index;
        if(length % 2 == 0){
            index = (length / 2);
        }else{
            index = (length / 2) + 1;
        }
        ListNode mid = get(index, head);
        head = mid;
        return head;
    }
	
//  Finding node for the respective index: 
     public ListNode get(int index, ListNode head){
        ListNode node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }}