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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        TreeNode dummy=root;
        Queue<TreeNode> que= new LinkedList<>();
        que.add(dummy);
        
        while(que.isEmpty()==false){
            
            List<Integer> temp= new ArrayList<>();
            Queue<TreeNode> queT= new LinkedList<>();
            
            while(que.isEmpty()==false){
                TreeNode temp2=que.poll();
                temp.add(temp2.val);
                if(temp2.left!=null) queT.add(temp2.left);
                if(temp2.right!=null) queT.add(temp2.right);
            }
            
            ans.add(temp);
            que=queT;
            
        }
        
        return ans;
        
        
    }
}