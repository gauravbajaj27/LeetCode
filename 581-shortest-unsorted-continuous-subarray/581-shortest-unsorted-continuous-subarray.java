class Solution {
    public int findUnsortedSubarray(int[] arr) {
        int n=arr.length;
        int[] temp= new int[n];
        
        for(int i=0;i<n;i++) temp[i]=arr[i];
        
        Arrays.sort(temp);
        
        int left=0;
        int right=n-1;
        
        while(left<n && arr[left]==temp[left]) left++;
        while(right>=0 && arr[right]==temp[right]) right--;
        
        
        if(left<=right) return (right-left+1);
        else return 0;
        
    }
}