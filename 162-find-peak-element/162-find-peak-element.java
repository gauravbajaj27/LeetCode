class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                max=nums[i];
                ans=i;
            }
        }
        return ans;
    }
}