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
    public static TreeNode ans;
    
    public static boolean solve(TreeNode root, TreeNode p, TreeNode q){
        // System.out.prinln(root.val+" "+ans.val);
        if(root==null) return false;
        
        boolean f1=false;
        boolean f2=false;
        f1=solve(root.left,p,q);
        f2=solve(root.right,p,q);
        
        boolean f3=false;
        if(root==q || root==p) f3=true;
        
        if(f1 && f2 || (f1 && f3)   || (f2 && f3)){
            ans=root;
        }
        if(f1 || f2 || root==q || root==p) return true;
        return false;
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans= new TreeNode(-1);
        solve(root,p,q);
        return ans;
        
    }
}