class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
        
        int n=arr.length;
        int m=queries.length;
        
        int[] ans= new int[m];
        
        int sum=0;
        for(int i=0;i<n;i++){
            
            if(arr[i]%2==0) sum+=arr[i];
            
        }
        
        for(int i=0;i<m;i++){
            int val=queries[i][0];
            int index=queries[i][1];
            int temp=arr[index];
            arr[index]+=val;
            if(temp%2==0)sum-=temp;
            if(arr[index]%2==0) sum+=arr[index];
            ans[i]=sum;
        }
        return ans;
    }
}