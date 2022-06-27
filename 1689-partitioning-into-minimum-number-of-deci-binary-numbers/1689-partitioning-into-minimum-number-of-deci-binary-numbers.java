class Solution {
    public int minPartitions(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int num=Integer.parseInt(Character.toString(s.charAt(i)));
            max=Math.max(num,max);
        }
        return max;
    }
}