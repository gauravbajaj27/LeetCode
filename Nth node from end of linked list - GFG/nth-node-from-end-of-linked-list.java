//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
	

	
public class LinkedList_Element_From_Last
{
    Node head;  
	Node tail;
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])throws IOException
    {
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(in.readLine().trim());
		 
		 while(t>0)
         {
             String s[]=in.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
			//int n=Integer.parseInt(br.readLine());
			s=in.readLine().trim().split(" ");
			int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = Integer.parseInt(s[i]); 
				llist.addToTheLast(new Node(a));
			}
          
		//System.out.println(llist.head.data);
        GfG g = new GfG(); 
		//System.out.println(k);
		System.out.println(g.getNthFromLast(llist.head,k));
		
			t--;
		}
	}
}


	
	
// } Driver Code Ends


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	int len=0;
    	Node dummy=head;
    	while(dummy!=null){
    	    len++;
    	    dummy=dummy.next;
    	}
    	
    	int node_index=len-n; node_index++;
    // 	System.out.println(node_index+" kashdf");
    	if(n<1) return -1;
    	
    	int cur_len=0;
    	while(head!=null){
    	    cur_len++;
    	   // System.out.println(cur_len+" akjdf");
    	    if(cur_len==node_index) return head.data;
    	    head=head.next;
    	}
    	return -1;
    	
    	
    }
}
