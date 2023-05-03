/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node curr = head;
        Node childStart = head;
        Node childEnd = head;
        
        while(curr != null){  
            //find child        
            if(curr.child != null){
                childStart = curr.child;
                childEnd = childStart;
                //traverse child to the end
                while(childEnd.next != null) {
                    childEnd = childEnd.next;
                }
                //insert child
                childStart.prev = curr;
                childEnd.next = curr.next;
                if(childEnd.next != null) childEnd.next.prev = childEnd;
                curr.next = childStart;
                curr.child = null;
            }
            curr=curr.next;
        }
        return head;
    }
}