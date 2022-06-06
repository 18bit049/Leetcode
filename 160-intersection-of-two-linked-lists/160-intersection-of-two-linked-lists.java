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
        
        int a=size(headA);
        int b=size(headB);
        
        while(a>b)
        {
            headA=headA.next;
            a--;
        }
        while(b>a)
        {
            headB=headB.next;
            b--;
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
            if(headA==null)
                return null;
        }
        return headA;
    }
    int size(ListNode a)
    {
        int c=0;
        while(a!=null)
        {
            a=a.next;
            c++;
        }
        return c;
    }
}