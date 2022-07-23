class Solution {
    public List<Integer> countSmaller(int[] arr) {
        //Binary Search Approach
        // Create a List ans to store ans of each index
        //Start from the extreme left of nums arr and put each element in the second list on a specified index returned by binary search performing on second list (al2);
        
        
        LinkedList<Integer> ans= new LinkedList<>();
        List<Integer> al2= new ArrayList<>();
        
        int n=arr.length;
        
        
        for(int i=n-1;i>=0;i--){
            int index=binarySearch(al2,arr[i]);
            ans.addFirst(index);
            al2.add(index,arr[i]);
        }
        return ans;    
        
    }
    
    public int binarySearch(List<Integer> al, int num){
        
        int left=0;
        int right=al.size()-1;
        int mid=0;
        
        while(left<=right){
            mid=(right+left)/2;
            if(al.get(mid)<num){
                left=mid+1;
            }
            else right=mid-1;
        }
        return left;
        
        
    }
    
}