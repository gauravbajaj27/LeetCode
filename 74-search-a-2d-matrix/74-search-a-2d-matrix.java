class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int n=arr.length;
        int m=arr[0].length;
        boolean ans=false;
        for(int i=0;i<n;i++){
            if(arr[i][0]<=target && arr[i][m-1]>=target){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==target) {
                        System.out.println("YES");
                        ans=true; break;
                    }
                }
                if(!ans) break;
            }
        }
        return ans;
    }
}