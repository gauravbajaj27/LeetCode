class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int result=0;
        int i=0;
        int n=s.length();
        
        while(i<n && s.charAt(i)==' ') i++;
        
        if(i<n && s.charAt(i)=='+'){
            sign=1;i++;
        }
        else if(i<n && s.charAt(i)=='-'){
            sign=0; i++;
        }
        
        
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit= (int) (s.charAt(i)-'0');
            
            int limit=Integer.MAX_VALUE;
            
            if(result>(limit/10) || (result==limit/10 && digit>limit%10)){
                if(sign==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            
            result*=10; result+=digit; i++;
            
        }
        if(sign==0) return -result;
        else return result;
        
        
    }
}