class Solution {
    public int wiggleMaxLength(int[] arr) {
        int n=arr.length;
        
        if(n<2) return n;
        
        int prevdiff=arr[1]-arr[0];
        int count=0;
        if(prevdiff!=0) count=2;
        else count=1;
        
        for(int i=2;i<n;i++){
            int diff=arr[i]-arr[i-1];
            
            if(diff>0 && prevdiff<=0){
                count++;
                prevdiff=diff;
            }
            else if(diff<0 && prevdiff>=0){
                count++;
                prevdiff=diff;
            }
            
        }
        
        return count;
        
        
        
    }
}