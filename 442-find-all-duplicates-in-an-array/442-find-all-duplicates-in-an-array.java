class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.put(arr[i],hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        List<Integer> ans= new ArrayList<>();
        for(int i:hm.keySet()){
            int b=hm.get(i);
            if(b==2) ans.add(i);
        }
        return ans;
    }
}