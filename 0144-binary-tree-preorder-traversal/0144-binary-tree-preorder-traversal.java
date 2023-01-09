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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return handleTraversal(list, root);
    }
    
    public List<Integer> handleTraversal(List list, TreeNode root) {    
        if(root == null) return list;
        
        list.add(root.val);
        handleTraversal(list, root.left);
        handleTraversal(list, root.right); 
        return list;
    }
}