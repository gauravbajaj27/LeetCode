/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans= new ArrayList<>();
        
        Queue<Node> que= new LinkedList<>();
        que.add(root);
        
        if(root==null) return ans;
        
        while(que.isEmpty()==false){
            List<Integer> list= new ArrayList<>();
            Queue<Node> que2= new LinkedList<>();
            while(que.isEmpty()==false){
                Node temp=que.poll();
                list.add(temp.val);
                List<Node> child= temp.children;
                for(int i=0;i<child.size();i++){
                    que2.add(child.get(i));
                }
            }
            ans.add(list); que=que2;
            
        }
        return ans;
        
    }
}