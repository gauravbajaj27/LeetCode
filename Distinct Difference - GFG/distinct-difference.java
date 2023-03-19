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
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        int[] left= new int[N];
        int[] right= new int[N];
        
        left[0]=0;
        HashSet<Integer> hs= new HashSet<>();
        hs.add(A[0]);
        for(int i=1;i<N;i++){
            left[i]=hs.size();
            hs.add(A[i]);
        }
        
        
        right[N-1]=0;
        hs.clear();
        hs.add(A[N-1]);
        for(int i=N-2;i>=0;i--){
            right[i]=hs.size();
            hs.add(A[i]);
        }
        
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<N;i++){
            int temp=left[i]-right[i];
            ans.add(temp);
        }
        return ans;
        
        
    }
}
        
