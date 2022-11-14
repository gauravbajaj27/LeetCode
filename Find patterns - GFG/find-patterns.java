//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String s, String w){
        
        int n=s.length();
        int m=w.length();
        
        char[] arr1=s.toCharArray();
        char[] arr2=w.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            int k=i;
            if(arr1[i]==arr2[0]){
                int p=0;
                while(k<n){
                    if(p<m && arr1[k]==arr2[p]){
                        arr1[k]='@';
                        p++;
                    }
                    k++;
                }
                if(p==m) count++;
                
            }
        }
        
        return count;
    
    
    }
}