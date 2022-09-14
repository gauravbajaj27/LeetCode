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
    public static int count;
    
    public static boolean check(int[] arr){
        int c1=0;
        int c2=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]!=0) c1++;
            else if(arr[i]%2==1)c2++;
        }
        if(c2<=1) return true; 
        else return false;
        
    }
    
    public static void solve(TreeNode root, int[] arr){
        
        if(root==null) return;
        
        arr[(root.val)-1]++;
        
        if(root.left==null && root.right==null){
            // System.out.println(root.val+ "   CHECK");
            boolean f=check(arr);
            // for(int i=0;i<9;i++) System.out.print(arr[i]+" ");
            // System.out.println();
            if(f) count++;
        }
        
        
        solve(root.left,arr);
        solve(root.right,arr);
        arr[root.val-1]--;
    }
    
    
    public int pseudoPalindromicPaths (TreeNode root) {
        count=0;
        int[] arr= new int[9];
        solve(root,arr);
        return count;
    }
}