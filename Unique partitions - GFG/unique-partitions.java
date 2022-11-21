//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<ArrayList<Integer>> ans;
    
    public static void solve(int[] dp, int n, ArrayList<Integer> al, int index){
        
        // System.out.println(n+" "+al);
        
        if(n==0){
            ArrayList<Integer> al2=al;
            Collections.sort(al2,Collections.reverseOrder());
            if(ans.contains(al)==false)ans.add(new ArrayList<>(al2)); return;
        }
        
        if(n<0) return;
        
        
        for(int i=index;i>=1;i--){
            al.add(i);
            solve(dp,n-i,al,i);
            al.remove(al.size()-1);
        }
        
        
    }
    
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        int[] dp= new int[n+1];
        ans= new ArrayList<>();
        Arrays.fill(dp,-1);
        solve(dp,n, new ArrayList<Integer>(),n);
        return ans;
    }
}