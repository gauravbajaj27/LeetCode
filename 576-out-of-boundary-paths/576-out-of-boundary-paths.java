class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        //Recursion +  Memoization method
        int[][][] dp= new int[m][n][maxMove+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<=maxMove;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solve (m,n,startRow,startColumn, maxMove, dp);    
    }
    
    public static int solve(int m, int n, int i, int j, int N, int[][][] dp){
        
        if(i==m || j==n || i<0 || j<0) return 1;
        if(N==0) return 0;
        if(dp[i][j][N]!=-1) return dp[i][j][N];
        
        int sum1=(solve(m,n,i-1,j,N-1,dp)+solve(m,n,i+1,j,N-1,dp))%1000000007;
        int sum2=(solve(m,n,i,j-1,N-1,dp)+solve(m,n,i,j+1,N-1,dp))%1000000007;
        return dp[i][j][N]=(sum1+sum2)%1000000007;
        
    }
    
    
    
}