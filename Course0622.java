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
        if(headA == null || headB == null) return null;
        ListNode pA=headA,pB=headB;
        while(pA!=pB){
            pA=pA==null?pB:pA.next;
            pB=pB==null?pA:pB.next;
        }
        return pA;   
    }
}