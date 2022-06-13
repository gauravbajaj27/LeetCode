class Solution {
    
    public static int[][] dp;
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        dp= new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,triangle);
    }
    
    
    public static int solve(int level, int pos, List<List<Integer>> al){
        
        if(dp[level][pos]!=-1) return dp[level][pos];
        
        int ans=al.get(level).get(pos);
        if(level<al.size()-1){
            ans+=Math.min(solve(level+1,pos,al),solve(level+1,pos+1,al));
        }
        return dp[level][pos]=ans;
        
    }
}