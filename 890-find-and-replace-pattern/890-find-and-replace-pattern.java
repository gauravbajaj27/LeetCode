class Solution {
    public List<String> findAndReplacePattern(String[] arr, String s) {
        // Use HashMap
        // Store indexing a->x x->a
        //If violated anywhere, return false
        
        List<String> ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            
            HashMap<Character, Character> hm1= new HashMap<>();
            HashMap<Character, Character> hm2= new HashMap<>();
            boolean f=true;
            for(int j=0;j<s.length();j++){
                char ch1=s.charAt(j);
                char ch2=word.charAt(j);
                
                if(hm1.containsKey(ch1)==false) hm1.put(ch1,ch2);
                if(hm2.containsKey(ch2)==false) hm2.put(ch2,ch1);
                if(hm1.get(ch1)!=ch2 || hm2.get(ch2)!=ch1){
                    f=false; break;
                } 
                
            }
            if(f) ans.add(word);
            
        }
        return ans;
        
        
    }
}