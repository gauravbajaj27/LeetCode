class Solution {
    public int lastStoneWeight(int[] stones) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int n=stones.length;
        for(int i=0;i<n;i++) al.add(stones[i]);
        
        Collections.sort(al);
        while(al.size()>1){
            int a=al.get(al.size()-1);
            int b=al.get(al.size()-2);
            System.out.println(al);
            int temp=a-b;
            int temp2=al.size();
            al.remove(temp2-1);
            // System.out.println(al);
            al.remove(temp2-2);
            if(temp!=0){
                al.add(temp);
                Collections.sort(al);
            }
            
        }
        
        if(al.size()>0){
            return al.get(0);
        }
        else return 0;
        
    }
}