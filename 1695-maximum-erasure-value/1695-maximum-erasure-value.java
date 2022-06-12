class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        //Two-pointer approach
        int n=arr.length;
        
        int ans=0;
        int currSum=0;
        int l=0;
        HashSet<Integer> hs= new HashSet<>();
        
        for(int r=0;r<n;r++){
            while(hs.add(arr[r])==false){
                currSum-=arr[l];
                hs.remove(arr[l]);
                l++;
            }
            
            currSum+=arr[r];
            ans=Math.max(ans,currSum);
            
        }
        
        return ans;
        
        
    }
}