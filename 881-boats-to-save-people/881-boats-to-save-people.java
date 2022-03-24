class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int n=arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int count=0;
        while(left<=right){
            if(left==right){
                count++; break;
            }
            if(arr[left]+arr[right]<=limit){
                left++;
                right--;
                count++;
            }
            else{
                right--;
                count++;
            }
        }
        
        
        return count;
    }
}