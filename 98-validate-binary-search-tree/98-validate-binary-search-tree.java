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
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public static boolean solve(TreeNode node, long max, long min){
        if(node==null) return true;
        if(node.val<=min || node.val>=max) return false;
        return (solve(node.left,node.val,min) && solve(node.right,max,node.val));
    }
    
}