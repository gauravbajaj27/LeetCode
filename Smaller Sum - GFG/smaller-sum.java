//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.get(arr[i]).add(i);
            else{
                ArrayList<Integer> temp= new ArrayList<>(); temp.add(i); 
                hm.put(arr[i],temp);
            }
            hs.add(arr[i]);
        }
        
        ArrayList<Integer> nums= new ArrayList<>();
        for(int i:hs) nums.add(i);
        Collections.sort(nums);
        
        long sum=0;
        long ans[]= new long[n];
        for(int i:nums){
            ArrayList<Integer> al=hm.get(i);
            for(int j:al) ans[j]=sum;
            sum+=(long)i * (long)al.size();
        }
        return ans;
        
    }
}