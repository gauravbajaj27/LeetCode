class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        
        Arrays.sort(arr, (a,b) -> b[1]-a[1]);
        int score=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            
            if(a<=truckSize){
                truckSize-=a;
                score+=(a*b);
            }
            else{
                score+=(truckSize*b);
                truckSize=0;
                break;
            }
            
        }
        return score;
        
    }
}