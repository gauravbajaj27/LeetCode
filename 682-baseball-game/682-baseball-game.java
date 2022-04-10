class Solution {
    public int calPoints(String[] arr) {
        int n=arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=arr[i];
            if(s.equals("C")){
                al.remove(al.size()-1);
            }
            else if(s.equals("D")){
                al.add(al.get(al.size()-1)*2);
            }
            else if(s.equals("+")){
                int a=al.get(al.size()-1);
                int b=al.get(al.size()-2);
                al.add(a+b);
            }
            else{
                int temp=Integer.parseInt(s);
                al.add(temp);
            }
        }
        
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum+=al.get(i);
        }
        return sum;
    }
}