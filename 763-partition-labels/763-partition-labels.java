class Solution {
    public List<Integer> partitionLabels(String s) {
        
        //last Indices?
        //Caputre last indeices
        //Use them for each iteration . If indices matches the max.
        int n=s.length();
        int[] arr= new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
        }
        
        int max=Integer.MIN_VALUE;
        List<Integer> al = new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[s.charAt(i)-'a']);
            count++;
            if(max==i){
                al.add(count);
                count=0;
            }
        }
        
        return al;
        
    }
}