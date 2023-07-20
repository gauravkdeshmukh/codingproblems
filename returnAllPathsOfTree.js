/**
 * This problem was asked by Facebook.
 * Given a binary tree, return all paths from the root to leaves.
 * For example, given the tree:
 * 1
  / \
 2   3
    / \
   4   5
Return [[1, 2], [1, 3, 4], [1, 3, 5]].
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {string[][]}
 */


function TreeNode(val, left, right) {
         this.val = (val===undefined ? 0 : val)
         this.left = (left===undefined ? null : left)
         this.right = (right===undefined ? null : right)
}

const root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, new TreeNode(4,null,null), new TreeNode(5, null, null)));
var binaryTreePaths = function(root) {
    let result = [];
    dfs(root, "");
    function dfs(root, currentPath) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            currentPath += root.val;
            result.push(currentPath);
            return;
        }
        dfs(root.left, currentPath + root.val + "->");
        dfs(root.right, currentPath + root.val + "->");
    }
    return result;
};

console.log(binaryTreePaths(root));