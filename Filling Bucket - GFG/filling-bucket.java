//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static int solve(int n, int[] dp){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int num1=solve(n-1,dp)%100000000;
        int num2=solve(n-2,dp)%100000000;
        
        return dp[n]=(num1+num2)%100000000;
        
    }
    
    
    static int fillingBucket(int N) {
        if(N==1) return 1;
        if(N==2) return 2;
        int[] dp= new int[N+1];
        Arrays.fill(dp,-1);
        return solve(N, dp);
        
    }
};