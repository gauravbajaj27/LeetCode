class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        
        int[] count1= new int[26];
        
        for(int i=0;i<words2.length;i++){
            
            String a=words2[i];
            int[] temp= new int[26];
            for(int j=0;j<a.length();j++){
                temp[a.charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++){
                count1[j]=Math.max(count1[j],temp[j]);
            }
            
        }
        
        List<String> ans= new ArrayList<>();
        
        for(int i=0;i<words1.length;i++){
            String a=words1[i];
            int[] temp= new int[26];
            for(int j=0;j<a.length();j++){
                temp[a.charAt(j)-'a']++;
            }
            boolean f=true;
            for(int j=0;j<26;j++){
                if(temp[j]<count1[j]){
                    f=false; break;
                }
            }
            
            if(f) ans.add(a);
            
        }
        return ans;
        
        
    }
}