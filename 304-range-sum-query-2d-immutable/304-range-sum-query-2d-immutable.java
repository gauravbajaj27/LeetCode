class NumMatrix {
    
    public int[][] dp;
    public int[][] main1;
    
    public NumMatrix(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        main1= new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                main1[i][j]=arr[i][j];
            }
        }
        
        dp= new int[n][m];
        
        
        for(int i=0;i<n;i++){
            dp[i][0]=arr[i][0];
        }
        
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i][j-1]+arr[i][j];
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int ans=0;
        for(int i=row1;i<=row2;i++){
            ans+=dp[i][col2]-dp[i][col1];
            ans+=main1[i][col1];
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */