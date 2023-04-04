//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String str = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.minSteps(str));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
	int minSteps(String s) {
		//Write your code here
		int i=0;
		int n=s.length();
		int ca=0;
		int cb=0;
		boolean fa=false;
		boolean fb=false;
		while(i<n){
		    if(s.charAt(i)=='a'){
		        fa=true;
		        while(i+1<n && s.charAt(i+1)=='a'){
		            i++;
		        }
		        i++;
		        ca++;
		    }
		    else{
		        fb=true;
		        while(i+1<n && s.charAt(i+1)=='b'){
		            i++;
		        }
		        i++;
		        cb++;
		    }
		}
		
		int val1=ca;
		if(fb) val1++;
		int val2=cb;
		if(fa) val2++;
		
		return Math.min(val1, val2);
	}
}