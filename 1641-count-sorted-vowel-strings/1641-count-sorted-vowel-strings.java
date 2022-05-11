class Solution {
    public int countVowelStrings(int n) {
        int c_a=1;
        int c_e=1;
        int c_i=1;
        int c_o=1;
        int c_u=1;
        
        if(n==1) return 5;
        
        for(int i=1;i<n;i++){
            c_a=c_a+c_e+c_i+c_o+c_u;
            c_e=+c_e+c_i+c_o+c_u;
            c_i=c_i+c_o+c_u;
            c_o=c_o+c_u;
        }
        
        int ans=c_a+c_e+c_i+c_o+c_u; return ans;
        
        
    }
}