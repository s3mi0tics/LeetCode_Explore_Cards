/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> aSet = new HashSet<ListNode>();
        
        while(headA != null) {
            aSet.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(aSet.contains(headB)) {
                return headB;               
            }
            headB = headB.next;
        }
        return null;
    }
}

// TIME COMPLEXITY: O(N+M)
// SPACE COMPLEXITY: O(M)