//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String s,char x[],int b[], int n){
        
        int[] arr= new int[26];
        int[] arr2= new int[26];
        
        for(int i=0;i<n;i++){
            if((int)x[i]>=97)arr[x[i]-'a']=b[i];
            else arr2[x[i]-'A']=b[i];
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]==0) arr[i]= (i+97);
        }
        
        for(int i=0;i<26;i++){
            if(arr2[i]==0) arr2[i]= (i+65);
        }
        
        // for(int i=0;i<26;i++){
        //     System.out.print(arr2[i]+" ");
        // }
        // System.out.println();
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        String ans="";
        String temp="";
        for(int i=0;i<s.length();i++){
           
            if((int)s.charAt(i)>=97)sum+=arr[s.charAt(i)-'a'];
            else sum+=arr2[s.charAt(i)-'A'];
            temp+=s.charAt(i);
            if(sum>max){
                max=sum;
                ans=temp;
            }
            if(sum<0){
                sum=0; temp="";
            }
            
            //  System.out.print(sum+" ");
        }
        return ans;
        
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends