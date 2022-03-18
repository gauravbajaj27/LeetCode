class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n=s.length();
        st.push(0);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') st.push(0);
            else{
                int a=st.pop();
                int b=st.pop();
                int temp=b;
                temp+=Math.max(2*a,1);
                st.push(temp);
            }
        }
        return st.pop();
        
    }
}