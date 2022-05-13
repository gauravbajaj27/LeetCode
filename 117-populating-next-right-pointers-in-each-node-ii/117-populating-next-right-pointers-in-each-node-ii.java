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
        Node main=root;
        List<Node> al = new ArrayList<>();
        
        al.add(main);
        while(al.isEmpty()==false){
            List<Node> temp= new ArrayList<>();
            
            for(int i=0;i<al.size();i++){
                Node node1=al.get(i);
                if(node1.left!=null) temp.add(node1.left);
                if(node1.right!=null) temp.add(node1.right);
            }
            
            al.add(null);
            
            for(int i=0;i<al.size()-1;i++){
                Node node1=al.get(i);
                node1.next=al.get(i+1);
            }
            
            al=temp;
            
        }
        
        return root;
        
    }
}