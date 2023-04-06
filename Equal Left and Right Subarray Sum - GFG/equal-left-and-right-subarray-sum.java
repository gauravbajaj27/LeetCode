//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] arr, int n) {
		//Write your code here\
		if(n==1) return 1;
		if(n==2) return -1;
		long[] pre= new long[n];
		long[] suf= new long[n];
		
		pre[0]=(long)arr[0];
		for(int i=1;i<n;i++){
		    pre[i]=pre[i-1]+(long)arr[i];
		}
		suf[n-1]=(long)arr[n-1];
		for(int i=n-2;i>=0;i--){
		    suf[i]=suf[i+1]+(long)arr[i];
		}
		
		
		
		for(int i=0;i<n-2;i++){
		    long a=pre[i];
		    long b=suf[i+2];
		    if(a==b){
		      //  System.out.println(i+" "+a+" "+b);
		        return i+2;
		    }
		}
		return -1;
		
	}
}