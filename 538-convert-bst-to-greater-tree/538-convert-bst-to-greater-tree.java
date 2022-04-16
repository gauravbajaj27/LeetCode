/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        
        if(root==null) return root;
        
        ArrayList<Integer> al = new ArrayList<>();
        TreeNode temp = root;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);
        
        while(!q.isEmpty()){
            TreeNode t1=q.poll();
            al.add(t1.val);
            if(t1.left!=null) q.add(t1.left);
            if(t1.right!=null) q.add(t1.right);
        }
        
        int[] arr = new int[al.size()];
        for(int i=0;i<arr.length;i++) arr[i]=al.get(i);
        Arrays.sort(arr);
        
        int[] arr2= new int[arr.length];
        arr2[arr.length-1]=arr[arr.length-1];
        
        for(int i=arr.length-2;i>=0;i--){
            arr2[i]=arr2[i+1]+arr[i];
        }
        
//         int i=0;
//         int j=arr2.length-1;
        
//         while(i<j){
//             int temp12=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp12;
//             i++; j--;
//         }
        
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int k=0;k<arr.length;k++) hm.put(arr[k],arr2[k]);
        
        // for(int p=0;p<arr.length;p++){
        //     System.out.print(arr2[p]+" ");
        // }
        // System.out.println();
        // System.out.println(hm);
        
        TreeNode temp2=root;
        Queue<TreeNode> q2 = new LinkedList<>();
        q2.add(temp2);
        
        while(!q2.isEmpty()){
            TreeNode t1=q2.poll();
            
            if(t1.left!=null) q2.add(t1.left);
            if(t1.right!=null) q2.add(t1.right);
            t1.val=hm.get(t1.val);
            
        
        }
        return root;
    }
}