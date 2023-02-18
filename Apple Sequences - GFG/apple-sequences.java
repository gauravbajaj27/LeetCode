//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        
        int i=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        int j=0;
        int o_avail=m;
        while(i<n){
            if(arr.charAt(i)=='A'){
                count++; 
            i++; continue;
            }
            
            if(arr.charAt(i)=='O' && o_avail>0){
                count++; o_avail--; 
            i++;continue;
            }
            else{
                max=Math.max(max,i-j);
                while(arr.charAt(j)=='A' && j<i){
                    j++;
                }
                if(j<i && arr.charAt(j)=='O'){
                    j++; 
                }
                i++;
            }
        }
        max=Math.max(max,i-j);
        return max;
        
        
    }
}


//{ Driver Code Starts.

// } Driver Code Ends