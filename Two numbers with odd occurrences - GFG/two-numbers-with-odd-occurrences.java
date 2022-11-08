//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.put(arr[i],hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        
        int index=0;
        int[] ans= new int[2];
        for(int i: hm.keySet()){
            if(hm.get(i)%2==1) ans[index++]=i;
        }
        // System.out.println(hm);
        if(ans[0]<ans[1]){
            int temp=ans[0];
            ans[0]=ans[1]; ans[1]=temp;
        }
        int[] ans2= new int[2];
        ans2[0]=ans[0];
        ans2[1]=ans[1];
        return ans2;
    }
}