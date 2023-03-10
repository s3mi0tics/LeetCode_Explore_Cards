/**
* Definition for singly-linked list.
* class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) {
*         val = x;
*         next = null;
*     }
* }
*/
public class Solution {
   public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       ListNode iterator = head;
       
       if(head == null) return null;
       while(fast.next != null && fast.next.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast) {
               slow = head;
               while(slow != fast){
                   slow = slow.next;
                   fast = fast.next;
               }
               return slow;
           }
       }   
       return null;
   }
}

/**
 * This is based on the concept that if there is a cycle
 * the node where pointers meet 
 * will be eqidistant from the start of the cycle 
 * as the start of the linked list to the start of the cycle.
 */