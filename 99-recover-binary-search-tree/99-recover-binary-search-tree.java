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
    public static int index;
    public static List<Integer> inOrder(TreeNode node, List<Integer> al){
        if(node==null) return al;
        inOrder(node.left,al);
        al.add(node.val);
        inOrder(node.right,al);
        return al;
    }
    
    
    public static void solve(TreeNode node, List<Integer> al){
        if(node==null) return;
        solve(node.left,al);
        // System.out.println(node.val+" "+index);
        node.val=al.get(index);
        index+=1;
        // System.out.println(node.val+" Changed");
        solve(node.right,al);
    }
    
    
    public void recoverTree(TreeNode root) {
        TreeNode dummy= root;
        TreeNode dummy2=root;
        List<Integer> al = new ArrayList<>();
        al=inOrder(dummy,al);
        Collections.sort(al);
        // System.out.println(al);
        index=0;
        solve(dummy2, al);
            
    }
}
    