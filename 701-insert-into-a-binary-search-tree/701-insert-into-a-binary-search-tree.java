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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode currNode = root;
        TreeNode newNode = new TreeNode(val);
        
        if(root == null) {
            return newNode;
        }
        
        while(currNode != null) {
            if(val < currNode.val) {
                if(currNode.left == null) {
                    currNode.left = newNode;
                    break;
                }
                currNode = currNode.left;
            } else {
                if(currNode.right == null) {
                    currNode.right = newNode;
                    break;
                }
                currNode = currNode.right;
            }
        }
        
        return root;
    }
}