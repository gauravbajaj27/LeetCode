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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = root;
        ArrayList<Integer> al = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(dummy);
        while(q.isEmpty()==false){
            TreeNode temp=q.poll();
            al.add(temp.val);
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        
        Collections.sort(al);
        
        TreeNode root2= new TreeNode(-1);
        TreeNode root3=root2;
        for(int i=0;i<al.size();i++){
            TreeNode temp= new TreeNode(al.get(i));
            root3.right=temp;
            root3=root3.right;
        }
        
        return root2.right;
        
        
        
    }
}