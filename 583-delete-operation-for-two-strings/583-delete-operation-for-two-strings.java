class Solution {
    
    public int minDistance(String word1, String word2) {
        //lcs technique
        int n=word1.length();
        int m=word2.length();
        int[][] dp= new int[n][m];
        return n+m-(2*lcs(n-1,m-1,word1,word2,dp));
    }
    
    public static int lcs(int i, int j, String s1, String s2, int[][] dp){
        if(i==-1 || j==-1) return 0;
        if(dp[i][j]>0) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+lcs(i-1,j-1,s1,s2,dp);
        else return dp[i][j]=Math.max(lcs(i-1,j,s1,s2,dp),lcs(i,j-1,s1,s2,dp));
    }
}