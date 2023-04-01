//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minOperations(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long minOperations(int n) {
        if(n==0) return 0;
        if(n==1) return 0;
        if(n==2) return 1;
        
        
        if(n%2==1) {
            int temp=n/2;
            return (long)((long)temp * (long)(temp+1));
        }
        else{
            int num1=2*(n/2)+1;
            int temp=num1-1;
            temp/=2;
            return (long)((long)temp * (long)(temp));
        }
        
        
    }
}