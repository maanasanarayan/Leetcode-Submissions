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
    // Recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        // return preOrder(root, new ArrayList<>());
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                result.add(root.val);
                st.push(root);
                root = root.left;
            }
            
            root = st.pop();
            root = root.right;
        }
        
        return result;
    }
    
    // private List<Integer> preOrder(TreeNode root, List<Integer> array) {
    //     array.add(root.value);
    //     if(root.left != null) {
    //         preOrder(root.left, array);
    //     }
    //     if(root.right != null) {
    //         preOrder(root.right, array);
    //     }
    // }
}