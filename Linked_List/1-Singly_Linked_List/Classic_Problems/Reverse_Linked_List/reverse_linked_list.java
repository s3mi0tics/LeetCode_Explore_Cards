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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode ogHead = head;
        ListNode temp = head;
        while(ogHead.next != null) {
            head = ogHead.next;
            ogHead.next = ogHead.next.next;
            head.next = temp;
            temp = head;          
        }
        return head;
    }
}