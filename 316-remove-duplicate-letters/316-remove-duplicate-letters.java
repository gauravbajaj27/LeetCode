class Solution {
    public String removeDuplicateLetters(String s) {
        
        // Increasing order of chars (Stack)
        int n=s.length();
        int[] indexChar = new int[26];
        for(int i=0;i<n;i++){
            indexChar[s.charAt(i)-'a']=i;
        }
        Stack<Integer> st = new Stack<>();
        boolean[] flag = new boolean[26];
        for(int i=0;i<s.length();i++){
            if(flag[s.charAt(i)-'a']) continue;
            while(st.isEmpty()==false && st.peek()>s.charAt(i)-'a' && indexChar[(int) (st.peek())]>i){
                int a=st.pop();
                flag[a]=false;
            }
            st.add(s.charAt(i)-'a');
            flag[s.charAt(i)-'a']=true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(st.isEmpty()==false){
            sb.append( (char) (st.pop()+'a') );
        }
        return sb.reverse().toString();
    }
}