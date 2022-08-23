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
    
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        ListNode slow= head;
        ListNode fast= head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next=reverse(slow.next);
        slow=slow.next;
        
        ListNode dummy=head;
        while(slow!=null){
            if(dummy.val!=slow.val) return false;
            slow=slow.next;
            dummy=dummy.next;
        }
        return true;
    }
}