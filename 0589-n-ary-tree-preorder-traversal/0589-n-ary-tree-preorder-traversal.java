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
    public List<Integer> preorder(Node root) {
       List<Integer> list = new ArrayList<Integer>();
       return handleTraversal(root, list);
    }
    
    public List<Integer> handleTraversal(Node root, List list) {
        if(root == null) return list;
        list.add(root.val);
        for(Node node: root.children){
            handleTraversal(node, list);
        }
        return list;  
    }
}