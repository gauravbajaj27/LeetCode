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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int count=0;
        while(que.isEmpty()==false){
            // System.out.println(que);
            Queue<TreeNode> que2= new LinkedList<>();
            
            while(que.isEmpty()==false){
                TreeNode temp=que.poll();
                if(temp.left!=null) que2.add(temp.left);
                if(temp.right!=null) que2.add(temp.right);
            }
            count++;
            que=que2;
        }
        return count;
    }
}