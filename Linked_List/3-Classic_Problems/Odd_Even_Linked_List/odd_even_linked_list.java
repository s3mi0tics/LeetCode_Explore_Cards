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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        
        ListNode current = head;
        ListNode evenHead = head.next;
        ListNode evenRunner = head.next;
        while(current.next != null) {
            current.next = current.next.next;
            if (current.next != null) {
                current = current.next;
                evenRunner.next = current.next;
                evenRunner = evenRunner.next;  
            }
                   
        }
        current.next = evenHead;
        return head;
    }
}