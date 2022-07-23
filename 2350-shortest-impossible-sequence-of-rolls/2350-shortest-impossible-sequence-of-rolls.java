class Solution {
    public int shortestSequence(int[] arr, int k) {
        // Good one
        //here, we create a hashset to store all values of arr as we traverse
        // if hashset size is k while traversing that means all the values of k have occured once or more (Note that a value of k might have occured just now i.e. there will always be a value having count 1 so this value cant form 2 number permuation while some other can)
        // We can say that we can create all permuations of 1 based on the values at present. So main_count=1;
        // Similarly if we find another such subarray having all k values we update main_count=2 as based on previous subarray and this one we can create all the possible subsequences of size=2
        //This goes on and we update the main_count value accordingly
        // At the end we return main_count+1 as we are able to create permutations of size main_count successfully and main_count+1 size will be the first subsequence size whose all permutation can't be created.
        
        
        HashSet<Integer> hs= new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            hs.add(arr[i]);
            if(hs.size()==k){
                count++; hs.clear();
            }
            
        }
        return count+1;
        
        
        
    }
}