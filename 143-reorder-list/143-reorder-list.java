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
 public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) return;
        
        Stack<ListNode> stack = new Stack<>();
        
        ListNode temp = head.next; // exclude head 
        while (temp != null) {
            
            stack.push(temp);
            temp = temp.next;
        }
        
        int total = stack.size() + 1; // add head 
        ListNode toRet = head;
        
        int num = 1;
        ListNode front = head.next;
        ListNode back = stack.pop();
        while(num < total) {
            
            head.next = back;
            num ++;
            
            if (num < total) {
                
				back.next = front;
                num ++;
            } else {
                
				// one case of end: when front = back 
                head = head.next;
                break;
            }
            
            head = head.next.next;
            if (!stack.isEmpty()) {
                
				back = stack.pop();
            }
            
            if (front != null) {
                
				front = front.next;
            }
        }
		
        head.next = null;
        head = toRet;
    }

}