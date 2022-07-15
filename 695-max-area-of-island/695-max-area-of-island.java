class Solution {
    
    public static int BFS(int[][] grid, boolean[][] flag, int i, int j, int n, int m){
        
        if(i>=n || i<0 || j<0 || j>=m)
            return 0;
        
        
        if(grid[i][j]==0 || flag[i][j]==true)
            return 0;
        
        flag[i][j]=true;
        
        int count=0;
        
        count+=BFS(grid,flag,i+1,j,n,m);
        count+=BFS(grid,flag,i-1,j,n,m);
        count+=BFS(grid,flag,i,j+1,n,m);
        count+=BFS(grid,flag,i,j-1,n,m);
        
        // System.out.println(count);
        
        return count+1;
        
    }
    
    
    public int maxAreaOfIsland(int[][] grid) {
        
        boolean[][] flag= new boolean[grid.length][grid[0].length];
        
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                flag[i][j]=false;
            }
        }
        
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(flag[i][j]==false && grid[i][j]==1){
                    int temp=BFS(grid,flag,i,j,n,m);
                    if(max<temp)
                        max=temp;
                }
            }
        }
        
        return max;
        
    }
}