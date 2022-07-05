class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
            hs.add(nums[i]);
        
        int max=0;
        int current=0;
        
        for(int num: hs){
            int currentNum=num;
            if(hs.contains(currentNum-1)==false){
                current++;
                while(hs.contains(currentNum+1)==true){
                    currentNum++;
                    current++;
                }
                if(current>max){
                    max=current;
                }
                current=0;
            }   
        }
        
        return max;
            
    }
}