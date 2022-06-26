class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        
        int[] prefix= new int[n+1];
        int[] suffix= new int[n+1];
        prefix[0]=0;
        suffix[n]=0;
        
        
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int i=n-1;i>=0;i--){
            suffix[i]=arr[i]+suffix[i+1];
        }
        
        
        int left=0;
        int right=k;
        int max=Integer.MIN_VALUE;
        while(right>=0){
            
            int sum1=prefix[left];
            int sum2=suffix[n-right];
            max=Math.max(max,sum1+sum2);
            left++;
            right--;
        }
        return max;
        
    }
}