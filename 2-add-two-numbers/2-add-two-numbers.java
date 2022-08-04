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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int r=0,s;
        ListNode head=null,sum,h, cur1=l1,cur2=l2;
        while(cur1!=null || cur2!=null){
            if(cur1!=null && cur2!=null)
            {
                s=(cur1.val+cur2.val+r)%10;
                r=(cur1.val+cur2.val+r)/10;
                
                sum=new ListNode(s);
                cur1=cur1.next;
                cur2=cur2.next;
            }
            else  if(cur1==null && cur2!=null)
            {
                s=(cur2.val+r)%10;
                r=(cur2.val+r)/10;
                
                sum=new ListNode(s);
               
               cur2=cur2.next;
            }
           else
            {
                s=(cur1.val+r)%10;
                r=(cur1.val+r)/10;
                
                sum=new ListNode(s);
               cur1=cur1.next;
            
            }
            
            if(head==null){
                head=sum;
                sum.next=null;
            }
            else{
                h=head;
                while(h.next!=null){
                    h=h.next;
                }
                h.next=sum;
                sum.next=null;
            }
            
        }
        if(r>0)
            {sum=new ListNode(r);
         h=head;
                while(h.next!=null){
                    h=h.next;
                }
                h.next=sum;
                sum.next=null;}
        
        return head;
    }
}