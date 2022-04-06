class Solution {
    public int threeSumMulti(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
            if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
            else hm.put(arr[i],1);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:set){
            al.add(i);
        }
        
        Collections.sort(al);
        long ans=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>target) continue;
            else{
                int temp=target-al.get(i);
                
                int j=i+1;
                int k=al.size()-1;
                
                
                while(j<k){
                    if((al.get(j)+al.get(k))==temp){
                        ans=(ans+ (hm.get(al.get(j))* hm.get(al.get(k))*hm.get(al.get(i))) )%1000000007;
                        System.out.println(ans+" "+ al.get(i)+" "+al.get(j)+" "+al.get(k));
                         j++; k--;
                    }
                    else if((al.get(j)+al.get(k))<temp){
                        j++;
                    }
                    else k--;
                }
                if(hm.containsKey(target-(2*al.get(i))) && hm.get(al.get(i))>=2   && al.get(i)!=target-(2*al.get(i))){
                    long a=hm.get(target-(2*al.get(i)));
                    long b=hm.get(al.get(i));
                    long temp2= (b*(b-1))/2;
                    ans=(ans+(a*temp2))%1000000007;
                    
                    System.out.println(target- 2*al.get(i));
                    System.out.println(a+" "+temp2);
                    System.out.println(i+" "+al.get(i)+" YES");
                    
                }
                
                if(hm.get(al.get(i))>=3 && al.get(i)*3==target ){
                    long temp3=hm.get(al.get(i));
                    System.out.println(temp3);
                    long temp4= (((temp3-1L)*temp3*(temp3-2L)) /6);
                    System.out.println(temp4);
                    ans=(ans+temp4)% 1000000007;
                    System.out.println(al.get(i)+" YES");
                }
                
                
            }
        }
        return (int)ans;
        
    }
}