class Solution {
    
    public static void swap(int[][] matrix, int i, int j, int k, int l){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[k][l];
        matrix[k][l]=temp;
    }
    
    public static void reverse(int[][] matrix, int i){
        int n=matrix[i].length;
        for(int j=0;j<n/2;j++){
            int temp= matrix[i][j];
            matrix[i][j]= matrix[i][n-1-j];
            matrix[i][n-1-j]=temp;
        }
    }
    
    public static void printMatrix(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }
        printMatrix(matrix);
        for(int i=0;i<n;i++)
            reverse(matrix,i);
    }
}