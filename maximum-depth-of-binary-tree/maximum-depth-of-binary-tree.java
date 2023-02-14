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
    public int helper(TreeNode root, int depth) {
        if(root == null) {
            return depth;
        }
        int leftMax = helper(root.left, depth + 1);
        int rightMax = helper(root.right, depth + 1);
        return Math.max(leftMax, rightMax);
    }
    
    public int maxDepth(TreeNode root) {
        int depth = 0;
        return helper(root, depth);
    }
}