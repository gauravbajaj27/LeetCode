//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
     HashSet<String> hs = new HashSet<>();
     
     for(String s:s1){
         String temp="";
         for(int i=0;i<s.length();i++){
             temp+=s.charAt(i);
             hs.add(temp);
         }
         temp="";
         for(int i=s.length()-1;i>=0;i--){
             temp=s.charAt(i)+temp;
             hs.add(temp);
         }
     }
     int count=0;
     for(String s:s2){
         if(hs.contains(s)) count++;
     }
     return count;
     
    }
}