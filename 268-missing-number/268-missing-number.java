class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] arr= new boolean[n+1];
        Arrays.fill(arr,false);
        for(int i=0;i<n;i++){
            arr[nums[i]]=true;
        }
        int ans=-1;
        
        // for(int i=0;i<=n;i++) System.out.println(arr[i]);
        
        for(int i=0;i<=n;i++){
            if(arr[i]==false){
                ans=i; break;
            }
        }
        return ans;
        
    }
}