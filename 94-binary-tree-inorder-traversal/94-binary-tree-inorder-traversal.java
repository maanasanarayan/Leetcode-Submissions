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
    
    // Iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(!st.empty() || root != null) {
            if(root != null) {
                st.push(root);
                root = root.left;
            } else {
                root = st.pop();
                array.add(root.val);
                root = root.right;
            }
        }
        return array;
    }
}