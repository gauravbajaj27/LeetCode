import java.util.HashMap;
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        
        TreeMap<Integer, ArrayList<Integer>> hm2= new TreeMap<>();
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int a=entry.getKey();
            int b=entry.getValue();
            
            if(hm2.containsKey(b)){
                hm2.get(b).add(a);
            }
            else{
                ArrayList<Integer> temp= new ArrayList<>();
                temp.add(a);
                hm2.put(b,temp);
            }
            
        }
       // NavigableMap hm3= hm2.descendingMap();
        
        int temp=k;
        int[] ans= new int[k];
        int index=0;
        ArrayList<Integer> al= new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> entry: hm2.entrySet()){
            int a=entry.getKey();
            ArrayList<Integer> b=entry.getValue();
            
            for(int i=0;i<b.size();i++){
                al.add(b.get(i));
            }
        }
        
        for(int i=al.size()-1;i>=0;i--){
            ans[index++]=al.get(i);
            if(index==k) break;
        }
        
        return ans;
        
    }
}