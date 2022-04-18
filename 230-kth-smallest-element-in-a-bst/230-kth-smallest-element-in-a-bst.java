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
    public static List<Integer> inOrder(TreeNode node, List<Integer> al){
        if(node==null) return al;
        inOrder(node.left,al);
        al.add(node.val);
        inOrder(node.right,al);
        return al;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> al = new ArrayList<>();
        al=inOrder(root,al);
        return al.get(k-1);
    }
}