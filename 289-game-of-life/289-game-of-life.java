class Solution {
    public void gameOfLife(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][] ans= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp=arr[i][j];
                int _1=0;
                if(i-1>=0 && arr[i-1][j]==1) _1++;
                if(i-1>=0 && j-1>=0 && arr[i-1][j-1]==1) _1++;
                if(i-1>=0 && j+1<m && arr[i-1][j+1]==1) _1++;
                if(i+1<n && arr[i+1][j]==1) _1++;
                if(i+1<n && j-1>=0 && arr[i+1][j-1]==1) _1++;
                if(i+1<n && j+1<m && arr[i+1][j+1]==1) _1++;
                if(j-1>=0 && arr[i][j-1]==1) _1++;
                if(j+1<m && arr[i][j+1]==1) _1++;
                
                // System.out.println(_1+" "+" ANS");
                
                if(arr[i][j]==1){
                    if(_1<2) ans[i][j]=0;
                    if(_1==2 || _1==3) ans[i][j]=1;
                    else ans[i][j]=0;
                }
                else{
                    if(_1==3) ans[i][j]=1;
                    else ans[i][j]=0;
                }
                
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ans[i][j];
            }
        }
        
    }
}