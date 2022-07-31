class Solution {
    public int longestCycle(int[] arr) {
        
        // Appraoch
        //If the node is yet not visited, visit that node i.e. perform DFS on that
        //Also, as there is only one outgoing edge per node, we just need to move forward to check if there is a end or a cycle exits
        // Create a hashset to store visited nodes
        // Create a local hashmap to store the current visited nodes and the distance from the base node (node from where we started)
        // If a cycle is found, get the size of cycle with the help of indices that were stored in hashmap
        //update ans
        // Also, if cycle is not found, move forward and update hashmap with current node and distance val and main hashset with current node
        //Update current node to arr[node] i.e. next node and increase distance
        
        
        HashSet<Integer> main= new HashSet<>();
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(main.contains(i)) continue;
            HashMap<Integer, Integer> hm= new HashMap<>();
            int temp=i;
            int dist=0;
            while(temp!=-1){
                if(hm.containsKey(temp)){
                   ans=Integer.max(ans,dist-hm.get(temp));
                    break;
                }
                if(main.contains(temp)) break;
                hm.put(temp,dist);
                main.add(temp);
                dist++;
                temp=arr[temp];
            }
        }
        return ans;
    }
}