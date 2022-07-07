class Solution {
    
    
    public static int help(String s1, String s2, String s3, int i, int j, int k, int[][] dp){
        
        if(i==s1.length()){
            boolean temp=s2.substring(j).equals(s3.substring(k));
            if(temp) return 1;
            else return 0;
        }
        if(j==s2.length()){
            boolean temp=s1.substring(i).equals(s3.substring(k));
            if(temp) return 1;
            else return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int temp1=0;
        int temp2=0;
        if(s1.charAt(i)==s3.charAt(k)){
            temp1=help(s1,s2,s3,i+1,j,k+1,dp);
        }
        if(s2.charAt(j)==s3.charAt(k)){
            temp2=help(s1,s2,s3,i,j+1,k+1,dp);
        }
        
        if(temp1==1 || temp2==1){
            dp[i][j]=1;
        }
        else dp[i][j]=0;
        
        return dp[i][j];
        
    }
    
    
    
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        int p=s3.length();
        
        if(m+n!=p) return false;
        
        int[][] dp= new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        
        int a=help(s1,s2,s3,0,0,0,dp);
        
        if(a==1) return true;
        else return false;
        
    }
}