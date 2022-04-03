class Solution {
    public int maximumCandies(int[] arr, long k) {
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];
        
        if(k>sum){
            return 0;
        }
        
        long l=1;
        long r=sum/k;
        
        
        while(l<=r){
            
            long mid=(l+r)/2;
            
            if (solve(mid, arr, k)==true){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            
            
        }
        
        return (int) r;
        
    }
    
    
    public static boolean solve(long mid,int[] arr, long k){
        
        long count=0;
        for(int i=0;i<arr.length;i++){
            count+= arr[i]/mid;
        }
        
        if(count>=k) return true;
        else return false;
    }
    
}