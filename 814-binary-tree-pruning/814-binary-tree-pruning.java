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
    
    public static boolean solve(TreeNode root){
        
        if(root.left==null && root.right==null){
            if(root.val==0) return false;
            else return true;
        }
        
        boolean f1=false;
        boolean f2=false;
        
        if(root.left!=null){
            f1=solve(root.left);
        }
        
        if(root.right!=null){
            f2=solve(root.right);
        }
        
        if(f1==false) root.left=null;
        if(f2==false) root.right=null;
        
        if(f1==false && f2==false && root.val==0) return false;
        else return true;
        
        
        
    }
    
    
    public TreeNode pruneTree(TreeNode root) {
        
        boolean f=solve(root);
        if(f==false) return null;
        return root;
        
    }
}