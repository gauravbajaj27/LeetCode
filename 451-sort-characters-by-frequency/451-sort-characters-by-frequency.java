class Solution {
    public String frequencySort(String s) {
        
        int[][] arr= new int[128][2];
        
        for(int i=0;i<128;i++){
            arr[i][1]=i;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)][0]++;
        }
        
        Arrays.sort(arr, (a,b) -> b[0]-a[0]);
        String ans="";
        for(int i=0;i<128;i++){
            int a=arr[i][0];
            for(int j=0;j<a;j++){
                ans+=(char)(arr[i][1]);
            }
        }
        return ans;
        
        
    }
}