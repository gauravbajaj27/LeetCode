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
        int len1=0;
        int len2=0;
        ListNode dummy1=headA;
        ListNode dummy2=headB;
        ListNode temp1=headA;
        ListNode temp2=headB;
        
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
                
        }
        
        if(len1>=len2){
            int diff=len1-len2;
            while(diff-->0) dummy1=dummy1.next;
        }
        else{
            int diff=len2-len1;
            while(diff-->0) dummy2=dummy2.next;
        }
        
        while(dummy1!=dummy2){
            dummy1=dummy1.next;
            dummy2=dummy2.next;
        }
        
        return dummy1;
    }
}