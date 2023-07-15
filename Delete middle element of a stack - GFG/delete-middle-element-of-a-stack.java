//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static void helper(Stack<Integer> st, int size, int mid, int index){
        
        if(index==mid){
            st.pop(); return;
        }
        else{
            int a=st.pop();
            // System.out.println(st);
            helper(st,size,mid, index+1);
            st.push(a);
            
        }
        
    }
    
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int size){
        int  mid = (size+1)/2;
        if(size%2==0) mid++;
        
        helper(s,size,mid,1);
        
        
        
    } 
}

