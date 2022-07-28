class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s.length()!=t.length()) return false;
        
        for(int i=0;i<s.length();i++) arr1[s.charAt(i)-'a']++;
        for(int j=0;j<t.length();j++) arr2[t.charAt(j)-'a']++;
        boolean ans=true;
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                ans=false; break;
            }
        }
        return ans;
    }
}