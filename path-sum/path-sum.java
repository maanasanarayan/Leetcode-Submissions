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
    public boolean helper(TreeNode root, int targetSum, int currSum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            if(currSum + root.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }
        
        boolean l = helper(root.left, targetSum, currSum + root.val);
        boolean r = helper(root.right, targetSum, currSum + root.val);
        return l || r;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root != null) {
            return helper(root, targetSum, 0);
        }
        
        return false;
    }
}