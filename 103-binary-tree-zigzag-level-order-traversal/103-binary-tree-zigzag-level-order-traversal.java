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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        TreeNode dummy=root;
        q.add(dummy);
        boolean f=true;
        while(q.isEmpty()==false){
            List<Integer> al= new ArrayList<>();
            Queue<TreeNode> q2= new LinkedList<>();
            while(q.isEmpty()==false){
                TreeNode temp=q.poll();
                if(temp.left!=null) q2.add(temp.left);
                if(temp.right!=null) q2.add(temp.right);
                al.add(temp.val);
            }
            if(f==false){
                Collections.reverse(al);
            }
            ans.add(al);
            q=q2;
            if(f) f=false;
            else f=true;
        }
        return ans;
        
    }
}