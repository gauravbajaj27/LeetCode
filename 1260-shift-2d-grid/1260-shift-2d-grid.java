class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        
        int n=arr.length;
        int m=arr[0].length;
        for(int l=0;l<k;l++){
            int temp=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==0 && j==0){
                        temp=arr[i][j]; continue;
                    }
                    int temp2=arr[i][j];
                    arr[i][j]=temp;
                    temp=temp2;
                }
            }
            arr[0][0]=temp;
        }
        
        
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp= new ArrayList<>();
            for(int j=0;j<m;j++){
                temp.add(arr[i][j]);
            }
            al.add(temp);
        }
        return al;
    }
}