//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class GfG {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0) {
            int B = sc.nextInt();
            int arr[][] = new int[B][B];
            for(int i = 0; i < B; i++) {
                for(int j = 0; j < B; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int ans[] = obj.findMaxRow(arr, B);
            for(int i = 0; i < 2; i++) {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static int upperBound(int[] arr, int target, int l, int r) {
    	while(l<=r) {
    		int mid=(l+r)/2;
    		if(arr[mid]<=target) l=mid+1;
    		else r=mid-1;
    	}
    	return l;
    }
    
    public static int lowerBound(int[] arr, int target, int l, int r) {
    	while(l<=r) {
    		int mid=(l+r)/2;
    		if(arr[mid]<target) l=mid+1;
    		else r=mid-1;
    	}
    	return l;
    }
    
    public int[] findMaxRow(int mat[][], int N) {
        
        int max=0;
        int row=0;
        
        for(int i=0;i<N;i++){
            int lower=lowerBound(mat[i],1,0,N-1);
            int upper=upperBound(mat[i],1,0,N-1);
            int diff=upper-lower;
            if(diff>max){
                max=diff;
                row=i;
            }
            
        }
        
        int[] arr= new int[2];
        arr[0]=row;
        arr[1]=max; return arr;
        
    }
};