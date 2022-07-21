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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     
        //IMP: Create a dummy node before head in case the left=1
        
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode node1=dummy;
        
        int index=0;
        while(index<left-1){
            node1=node1.next;
            index++;
        }
        
        int range=right-left;
        ListNode node2= node1.next;
        
        index=0;
        while(index<range){
            ListNode node3=node2.next;
            node2.next=node3.next;
            node3.next=node1.next;
            node1.next=node3;
            index++;
            
            // ListNode dummy2=head;
            // while(dummy2!=null){
            //     System.out.print(dummy2.val+" ");
            //     dummy2=dummy2.next;
            // }
            // System.out.println();
            
        }
        return dummy.next;
        
        
    }
}