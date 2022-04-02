class Solution {
    
    
    public static void mark(char[][] arr, int i, int j, int n, int m, boolean[][] flag){
        
        
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();
        st1.add(i);
        st2.add(j);
        
        while(st1.isEmpty()==false){
            int a=st1.pop();
            int b=st2.pop();
            // System.out.println(a+" "+b);
            flag[a][b]=true;
            if(a-1>=0 && arr[a-1][b]=='1' && flag[a-1][b]==false){
                st1.add(a-1);
                st2.add(b);
            }
            if(a+1<n && arr[a+1][b]=='1' && flag[a+1][b]==false){
                st1.add(a+1);
                st2.add(b);
            }
            if(b+1<m && arr[a][b+1]=='1' && flag[a][b+1]==false){
                st1.add(a);
                st2.add(b+1);
            }
            if(b-1>=0 && arr[a][b-1]=='1' && flag[a][b-1]==false){
                st1.add(a);
                st2.add(b-1);
            }
        }
        
        
    }
    
    
    public int numIslands(char[][] arr) {
        
        int n=arr.length;
        int m=arr[0].length;
        int count=0;
        boolean[][] flag= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='1' && flag[i][j]==false){
                    count++;
                    mark(arr,i,j,n,m,flag);
                }
            }
        }
        return count;
    }
}