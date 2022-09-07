class Solution {
    public int longestMountain(int[] arr) {
        
        
        int n=arr.length;
        if(n<3) return 0;
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int index1=i-1;
                int index2=i+1;
                int count=3;
                while(index1>0 && (arr[index1]>arr[index1-1]) ){
                    count++;
                    index1--;
                }
                while(index2<n-1 && (arr[index2]>arr[index2+1]) ){
                    count++;
                    index2++;
                }
                ans=Math.max(ans,count);
                
                // System.out.println(ans+" "+i);
            }
            
        }
        return ans;
        
    }
}