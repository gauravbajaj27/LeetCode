//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        
        int n=s.length();
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            int[] arr= new int[26];
            for(int j=i;j<n;j++){
                arr[s.charAt(j)-'a']++;
                
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(arr[k]!=0)max=Math.max(max,arr[k]);
                    if(arr[k]!=0)min=Math.min(min,arr[k]);
                }
                // System.out.println(max+" "+min+" "+i);
                sum+=(max-min);
            }
            
        }
        
        return sum;
        
    }
}
        
