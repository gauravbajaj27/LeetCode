class Solution {
    
    public static ArrayList<Integer> solve(String s, int i, int j){
        int left=i;
        int right=j;
        int n=s.length();
        int count=2;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
            count+=2;
            left--; right++;
        }
        
        al.add(left+1); al.add(right-1); al.add(right-left);
        return al;
    }
    
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int n=s.length();
        int min=Integer.MIN_VALUE;
        String ans="";
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ArrayList<Integer> al=solve(s,i-1,i);
                if(al.get(2)>min){
                    min=al.get(2);
                    ans=s.substring(al.get(0),al.get(1)+1);
                }
            }
        }
        
        for(int i=1;i<n-1;i++){
            if(s.charAt(i+1)==s.charAt(i-1)){
                ArrayList<Integer> al=solve(s,i-1,i+1);
                if(al.get(2)>min){
                    min=al.get(2);
                    ans=s.substring(al.get(0),al.get(1)+1);
                }
            }
        }
        
        if(min!=Integer.MIN_VALUE) return ans;
        else return s.substring(0,1);
    }
}