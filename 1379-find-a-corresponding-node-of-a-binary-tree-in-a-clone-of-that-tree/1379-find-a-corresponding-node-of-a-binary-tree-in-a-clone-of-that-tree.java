/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        
        TreeNode main1=original;
        TreeNode main2=cloned;
        int targetVal=target.val;
        
        
        Queue<TreeNode> q= new LinkedList<>();
        q.add(main2);
        while(q.isEmpty()==false){
            Queue<TreeNode> temp= new LinkedList<>();
            TreeNode temp_node=q.poll();
            if(temp_node.val==targetVal){
                return temp_node;
            }
            if(temp_node.left!=null) q.add(temp_node.left);
            if(temp_node.right!=null) q.add(temp_node.right);
            
        }
        return null;
        
    }
}