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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        List<Integer> vals = new ArrayList<>();
        
        // Convert LinkedList into ArrayList
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }
        
        // Use two-pointer technique to check for palindrome
        int front = 0;
        int back = vals.size() -1;
        while (front < back) {
            //Note we must use ! .equals instead of != because we are comparing Integer, not int
            if(!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front ++;
            back --;
        }
        return true;
    }
}