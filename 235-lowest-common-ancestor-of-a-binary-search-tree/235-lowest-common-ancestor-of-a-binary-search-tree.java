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
    
    public static TreeNode temp;
    public static boolean f;
    public static boolean solve(TreeNode curr, TreeNode p, TreeNode q){
        
        if(curr==null) return false;
        boolean f1=false; boolean f2=false;
        if(curr.val==p.val) f1=true;
        if(curr.val==q.val) f2=true;
        
        if(!f1)  f1=solve(curr.left,p,q);
        if(!f2)  f2=solve(curr.right,p,q);
        
        if(f1 && f2 && !f){
            f=true;
            temp=curr;
        }
        
        return (f1|f2);
        
        
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        f=false;
        temp= new TreeNode(0);
        if(p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        solve(root,p,q);
        
        return temp;
    }
}