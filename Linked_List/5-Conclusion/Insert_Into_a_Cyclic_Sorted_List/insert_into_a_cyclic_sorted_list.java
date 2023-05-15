/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        if(head == null){
            Node insertNode = new Node(insertVal);
            insertNode.next = insertNode;
            return insertNode;
        }
        
        Node prev = head;
        Node curr = head.next;
        boolean toInsert = false;
        
        do {
            if(prev.val <= insertVal && insertVal <= curr.val) {
            // Insert if the value of the new node sits between the minimal and maximal values of the current list. 
                toInsert = true;
            } 
            else if(prev.val > curr.val){
                // Else insert new node after the node with the maximal value (i.e. tail node) if the value of the new node goes beyond the minimal and maximal values of the current list, either less than the minimal value or greater than the maximal value
                if(insertVal >= prev.val || insertVal <= curr.val){
                    toInsert = true;
                }
            }
                
                if(toInsert) {
                    prev.next = new Node(insertVal, curr);
                    return head;
                }
                
                prev = curr;
                curr = curr.next;        
        } while (prev != head);

        // If the list contains all uniform values
        prev.next = new Node(insertVal, curr);
        return head;
    }
}
 