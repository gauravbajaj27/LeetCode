/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> que= new LinkedList<>();
        que.add(root);
        
        while(que.isEmpty()==false){
            
            Queue<Node> que2= new LinkedList<>();
            while(que.isEmpty()==false){
                Node a=que.poll();
                if(que.isEmpty()==false) a.next=que.peek();
                else a.next=null;
                if(a.left!=null) que2.add(a.left);
                if(a.right!=null) que2.add(a.right);
            }
            que=que2;
        }
        return root;
        
    }
}