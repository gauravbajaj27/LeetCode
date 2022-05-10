class Solution {
    
   public static List<List<Integer>> ans;
   public static  List<Integer> al;
    
    public static void solve(int k, int n, int start){
        
        if(n==0 && k==0){
            ans.add(new ArrayList<>(al));
        }
        if(k<=0 || n<=0){
            return;
        }
        
        for(int i=start;i<=9;i++){
                al.add(i);
                solve(k-1,n-i,i+1);
                al.remove(al.size()-1);
        }
        
    }
    
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans=new ArrayList<>();
        al= new ArrayList<>();
        solve(k,n,1);
        return ans;
    }
}