class Solution {
    public int uniquePaths(int m, int n) {
        
        if(m==1 && n==1) return 1;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        
        dp[0][0]=0;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int temp=0;
                if(i-1>=0){
                    temp+=dp[i-1][j];
                }
                if(j-1>=0){
                    temp+=dp[i][j-1];
                }
                dp[i][j]=temp;
            }
        }
        
        return dp[m-1][n-1];
    }
}