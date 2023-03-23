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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode pointer = head;
        while (pointer.next != null) {
            if(pointer == head && pointer.val == val) {
                head = head.next;
                pointer = pointer.next;
            }
            else if(pointer.next.val == val) {
                pointer.next = pointer.next.next;
            }
            else if (pointer.next.val != val) {
                pointer = pointer.next;
            }
        }
        return head.val == val? null : head;
    }
}