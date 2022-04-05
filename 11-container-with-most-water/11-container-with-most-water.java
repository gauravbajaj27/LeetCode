class Solution {
    public int maxArea(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans=0;
        
        while(left<right){
            
            int temp=(right-left)*Math.min(arr[left],arr[right]);
            if(temp>ans) ans=temp;
            
            if(arr[left]<=arr[right]) left++;
            else right--;
            
        }
        
        return ans;
                       
                       
                       
    }
}