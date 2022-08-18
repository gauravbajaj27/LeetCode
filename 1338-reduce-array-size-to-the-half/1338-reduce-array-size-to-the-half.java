class Solution {
    public int minSetSize(int[] arr) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
       
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        
        ArrayList<Integer> al= new ArrayList<>();
        for(int i:hm.keySet()) al.add(hm.get(i));
        
        Collections.sort(al);
        int temp=n/2;
        int temp2=0;
        int count=0;
        for(int i=al.size()-1;i>=0;i--){
            temp2+=al.get(i);
            count++;
            if(temp2>=temp){
                return count;
            }
        }
        return -1;
    }
}