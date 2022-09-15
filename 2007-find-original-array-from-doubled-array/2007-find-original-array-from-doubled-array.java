class Solution {
    public int[] findOriginalArray(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        boolean ans=true;
        ArrayList<Integer> al= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 && hm.containsKey(arr[i]) && hm.containsKey(arr[i]/2) && hm.get(arr[i])>0 && hm.get(arr[i]/2)>0){
                // System.out.println(hm);
                hm.put(arr[i],hm.get(arr[i])-1);
                hm.put(arr[i]/2,hm.get(arr[i]/2)-1);
                if(hm.get(arr[i])<0) continue;
                al.add(arr[i]/2);
            }
        }
        // System.out.println(al);
        if(n%2==1) return new int[0];
        if(al.size()!=n/2) return new int[0];
        else{
            int[] ans2= new int[al.size()];
            for(int i=0;i<ans2.length;i++) ans2[i]=al.get(i); return ans2;
        }
    }
}