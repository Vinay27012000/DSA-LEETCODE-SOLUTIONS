/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void copyList(Node head){
        
        Node cur = head;
        while(cur != null){
            
            Node node = new Node(cur.val);
            Node fr = cur.next;
            cur.next = node;
            node.next = fr;
            cur = fr;
        }
    }
    
    public void copyPointers(Node head){
        Node cur = head;
        while(cur != null){
            
            Node random = cur.random;
            if(random != null){
                cur.next.random = random.next;
            }
            cur = cur.next.next;
        }
    }
    
    public Node extractNode(Node head){
        
        Node cur = head;
        Node dummy = new Node(-1);
        Node nCur = dummy;
        
        while(cur != null){
            
            nCur.next = cur.next;
            cur.next = cur.next.next;
            
            nCur = nCur.next;
            cur = cur.next;
        }
        
        return dummy.next;
        
    }
    public Node copyRandomList(Node head) {
        copyList(head);
        copyPointers(head);
        return extractNode(head);
    }
}