class Solution {
    public int longestStrChain(String[] arr) {
        
        //HashMap + DP 
        //Sort the arr with increasing order of lengths
        // Store String + streak count of each word from start
        // For every word check if by deleteting a character, you can find the string with one less character 
        // If yes then take its strak and add one to current (if current streak is less than the new one)
        //else delete another character and do the same
        
        int n=arr.length;
        
        Arrays.sort(arr, (a,b) -> a.length()-b.length());
        
        HashMap<String, Integer> hm = new HashMap<>();
        int max=1;
        for(int j=0;j<n;j++){
            String s=arr[j];
            
            hm.put(s,1);
            // System.out.println(hm);
            for(int i=0;i<s.length();i++){
                String temp=s.substring(0,i)+s.substring(i+1,s.length());
                // System.out.println(temp);
                if(hm.containsKey(temp) && hm.get(temp)+1>=hm.get(s)){
                    System.out.println(hm.get(temp));
                    hm.put(s,hm.get(temp)+1);
                }
                
            }
            max=Math.max(hm.get(s),max);
            
        }
        return max;
        
        
        
        
        
        
        
    }
}