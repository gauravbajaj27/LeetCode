class Solution {
    public int removePalindromeSub(String s) {
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            temp+=s.charAt(i);
        }
        
        if(s.equals(temp)){
            return 1;
        }
        else return 2;
    }
}