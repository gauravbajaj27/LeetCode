//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        long dp[][] = new long[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // if(i==0 && j==0) dp[i][j]=(long)1;
                // else{
                    if(i==0 && j==0){
                        if(grid[i][j]==1)dp[i][j]=1;
                        else dp[i][j]=0;
                        continue;
                    }
                    else if(grid[i][j]==1){
                        if(j-1>=0)dp[i][j]=(dp[i][j]+dp[i][j-1])%1000000007;
                        if(i-1>=0)dp[i][j]=(dp[i][j]+dp[i-1][j])% 1000000007;
                        continue;
                    }
                    else dp[i][j]=0;
                // }
                
                
            }
            
        }
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
            
        //     System.out.print(dp[i][j]+" ");
                
        //     }
        //     System.out.println();
            
        // }
        
        return (int) dp[n-1][m-1];
    }
};