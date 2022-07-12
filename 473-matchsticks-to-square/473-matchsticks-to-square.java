class Solution {
    public boolean makesquare(int[] arr) {
        
        if(arr.length==0 ) return false;
        
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%4!=0) return false;
        else{
            Arrays.sort(arr);
            return solve(arr,0,0,0,0,arr.length-1,sum/4);
        }
        
        
    }
    
    
    public static boolean solve(int[] arr, int top, int bottom, int left, int right, int index, int target){
        // System.out.println(top+ " "+bottom+" "+right+" "+left+" "+index+" "+target);
        if(top==target && bottom==target && left==target && right==target) return true;
        if(top>target || bottom>target || left>target || right>target) return false;
        
        if(solve(arr,top+arr[index],bottom,left,right,index-1,target)) return true;
        if(solve(arr,top,bottom+arr[index],left,right,index-1,target)) return true;
        if(solve(arr,top,bottom,left,right+arr[index],index-1,target)) return true;
        if(solve(arr,top,bottom,left+arr[index],right,index-1,target)) return true;
        return false;
        
    }
    
    
}