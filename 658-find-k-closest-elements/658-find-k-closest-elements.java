class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<right && (right-left+1)>k){
            int num1=Math.abs(arr[left]-x);
            int num2=Math.abs(arr[right]-x);
            
            if(num2>=num1){
                right--;
            } else left++;
        }
        
        List<Integer> al= new ArrayList<>();
        for(int i=left;i<=right;i++) al.add(arr[i]);
        return al;
        
    }
}