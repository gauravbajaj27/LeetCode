class Solution {
    public int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int min=arr[0];
        int max=arr[n-1];
        
        int temp=arr[n/2];
        
        int count=0;
        for(int i=0;i<n;i++){
            count+=Math.abs(arr[i]-temp);
        }
        return count;
    }
}