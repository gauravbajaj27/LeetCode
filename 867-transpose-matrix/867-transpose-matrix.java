class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int ans[][] = new int[m][n];
        
        int index1=0;
        int index2=0;
        
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                // System.out.println(index1+" "+index2);
                ans[index1][index2]=matrix[i][j];
                index2++;
            }
            index2=0;
            index1++;
        }
        return ans;
        
    }
}