class Solution {
    public int minDeletions(String s) {
        int[] arr= new int[26];
        int n=s.length();
        for(int i=0;i<s.length();i++) arr[s.charAt(i)-'a']++;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(arr[i]!=0)que.add(arr[i]);
        }
        HashSet<Integer> hs= new HashSet<>();
        int count=0;
        System.out.println(que);
        while(que.isEmpty()==false){
            int x=que.poll();
            int temp=x;
            while(hs.contains(x)){
                x--;
                count++;
                if(x==0) break;
            }
            if(x!=0) hs.add(x);
            
        }
        
        return count;
        
        
    }
}