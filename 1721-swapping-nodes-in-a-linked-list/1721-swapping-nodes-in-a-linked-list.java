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
    public ListNode swapNodes(ListNode head, int k) {
        
        int n=0;
        ListNode Dummy=head;
        while(Dummy!=null){
            n++;
            Dummy=Dummy.next;
        }
        
        int add2=n-k+1;
        int add1=k;
        ListNode n1=head;
        ListNode n2=head;
        int c1=0;
        int c2=0;
        while(n1!=null){
            c1++;
            if(c1==add1){
                break;
            }
            n1=n1.next;
        }
        while(n2!=null){
            c2++;
            if(c2==add2){
                break;
            }
            n2=n2.next;
        }
        
        int temp1=n2.val;
        int temp2=n1.val;
        n1.val=temp1;
        n2.val=temp2;
        
        return head;
        
        
    }
}