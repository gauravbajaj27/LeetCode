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
    public static HashSet<TreeNode> hs;
    public static int ans=0;
    public int minCameraCover(TreeNode root) {
        hs = new HashSet<>();
        hs.add(null);
        ans=0;
        TreeNode dummy=root;
        solve(dummy,null);
        return ans;
    }
    
    
    public static void solve(TreeNode node, TreeNode par){
        if(node==null) return;
        
        solve(node.left, node);
        solve(node.right, node);
        
        if((par==null && hs.contains(node)==false) || hs.contains(node.left)==false || hs.contains(node.right)==false){
            ans++;
            hs.add(node);
            hs.add(par);
            hs.add(node.left);
            hs.add(node.right);
        }
        
        
        
    }
    
}