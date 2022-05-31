class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        // Sliding winodow 
        // l=0 and r=k (start)
        // Move the window and store all th possible k-length substrings
        // If target string in hash set, then true else false 
        
        int left=0;
        int right=k;
        HashSet<String> hs= new HashSet<>();
        while(right<=s.length()){
            String temp=s.substring(left,right);
            hs.add(temp);
            left++; right++;
        }
        
        if(hs.size()==Math.pow(2,k)){
            return true;
        }
        return false;
        
    }
}