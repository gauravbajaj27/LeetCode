//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1); al.add(2); al.add(5); al.add(10); al.add(20);
        al.add(50); al.add(100); al.add(200); al.add(500); al.add(2000);
        
        List<Integer> ans= new ArrayList<>();
        int index=al.size()-1;
        while(N>0 && index>=0){
            while(al.get(index)<=N){
                ans.add(al.get(index));
                N=N-al.get(index);
                // System.out.println(N);
            }
            index--;
        }
        return ans;
        
    }
}