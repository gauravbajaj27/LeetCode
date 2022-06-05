class Solution {
        public static void solve(List<List<String>> ans,char[][] board, int[] leftRow, int[] leftDiagonal, int[] rightDiagonal, int column){
        
        if(column==board.length){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board[0].length;j++){
                    s+=board[i][j];
                }
                temp.add(s);
            }
            ans.add(temp);
            return ;
        }
        
        
        int n=board.length;
        for(int row=0;row<board.length;row++){
            if(leftRow[row]!=1 && leftDiagonal[row+column]!=1 && rightDiagonal[n-1+column-row]!=1){
                leftRow[row]=1;
                leftDiagonal[row+column]=1;
                rightDiagonal[n-1+column-row]=1;
                board[row][column]='Q';
                solve(ans,board,leftRow, leftDiagonal, rightDiagonal, column+1);
                leftRow[row]=0;
                leftDiagonal[row+column]=0;
                rightDiagonal[n-1+column-row]=0;
                board[row][column]='.';
            }
        }
        
    }
    
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        int[] leftRow = new int[n];
        int[] leftDiagonal= new int[(2*n)-1];
        int[] rightDiagonal= new int[(2*n)-1];
        solve(ans,board,leftRow,leftDiagonal,rightDiagonal,0);
        return ans.size();
    }
}