class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            
            if(arr[i]>arr[i+1]) continue;
            
            bricks-=arr[i+1]-arr[i];
            pq.add(arr[i+1]-arr[i]);
            
            if(bricks<0){
                bricks+=pq.poll();
                if(ladders>0) ladders--;
                else return i;
            }
            
            
            
        }
        return n-1;
        
        
        
        
    }
}