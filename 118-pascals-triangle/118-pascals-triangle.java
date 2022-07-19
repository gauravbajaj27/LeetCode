class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> al= new ArrayList<>();
         
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        al.add(temp1);
        if(numRows==1) return al;
        List<Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        temp2.add(1);
        al.add(temp2);
        if(numRows==2) return al;
        
        if(numRows>=3){
            numRows-=2;
            for(int i=0;i<numRows;i++){
                List<Integer> dummy= al.get(al.size()-1);
                List<Integer> temp = new ArrayList<>();
                int size=dummy.size()+1;
                for(int j=0;j<size;j++){
                    if(j==0 || j==size-1){
                        temp.add(1);
                        continue;
                    }
                    else{
                        temp.add(dummy.get(j)+dummy.get(j-1));
                    }
                }
                al.add(temp);
            }
        }
        return al;
    }
}