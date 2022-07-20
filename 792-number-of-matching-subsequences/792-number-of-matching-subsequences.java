class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        // Using HashMap save all the words and their frequency
        // Traverse through each word
        // Compare word from array and string by keeping two pointers 
        // If the pointer of array word reaches at end i.e. all the chars of array word are in String s.
        // Add freq of array word to ans
        
        HashMap<String, Integer> hm = new HashMap<>();
        int n=words.length;
        for(int i=0;i<n;i++) hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        int ans=0;
        for(String str:hm.keySet()){
            int m=s.length();
            int p=str.length();
            int i=0;
            int j=0;
            while(i<m  && j<p){
                if(s.charAt(i)==str.charAt(j)){
                    i++; j++;
                }
                else i++;
            }
            if(j==p) ans+=hm.get(str);
        }
        return ans;
        
        
    }
}