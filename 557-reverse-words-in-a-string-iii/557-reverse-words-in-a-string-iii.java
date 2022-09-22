class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        
        int n=arr.length;
        String ans="";
        for(int i=0;i<n;i++){
            String temp=arr[i];
            String temp2="";
            for(int j=temp.length()-1;j>=0;j--){
                temp2+=temp.charAt(j);
            }
            ans+=temp2;
            if(i!=n-1) ans+=" ";
        }
        return ans;
    }
}