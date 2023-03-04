//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] P = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.bestNode(N, A, P);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long bestNode(int N, int[] A, int[] P) {
        // code here
        int n=A.length;
        HashSet<Integer> parent = new HashSet<>();
        ArrayList<Integer> leafs= new ArrayList<>();
        for(int i:P) parent.add(i);
        for(int i=0;i<n;i++){
            if(parent.contains(i+1)==false){
                leafs.add(i);
            }
        }
        // System.out.println(leafs);
        long maxSum=Long.MIN_VALUE;
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i=0;i<n;i++) hm.put(A[i],i);
        for(int i:leafs){
            int sum=0;
            int curr=i;
            
            while(curr!=-1){
                sum*=-1;
                sum+=A[curr];
                // System.out.println(curr+" "+A[curr]+" "+ hm.get(P[curr]));
                if(P[curr]!=-1)curr=P[curr]-1;
                else curr=-1;
                maxSum=Math.max(maxSum,sum);
            }
            
        }
        return maxSum;
    }
}
        
