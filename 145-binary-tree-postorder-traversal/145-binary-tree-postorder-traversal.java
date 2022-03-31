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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null) {
            return postOrder(root, new ArrayList<>());
        } 
        return new ArrayList<>();        
    }
    
    private List<Integer> postOrder(TreeNode root, List<Integer> lst) {
        if(root.left != null) {
            postOrder(root.left, lst);
        }
        if(root.right != null) {
            postOrder(root.right, lst);
        }
        lst.add(root.val);
        
        return lst;
    }
}