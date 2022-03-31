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
        // if(root != null) {
        //     return postOrder(root, new ArrayList<>());
        // } 
        // return new ArrayList<>();     
        
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack();
        
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                st.push(root);
                root = root.left;
            }
            
            while(!st.isEmpty() && root == st.peek().right) {
                root = st.pop();
                res.add(root.val);
            }
            
            if(!st.isEmpty() && root != st.peek().right) {
                root = st.peek().right;
            }
            
            if(st.isEmpty()) break;
        }
        
        return res;
    }
    
//     private List<Integer> postOrder(TreeNode root, List<Integer> lst) {
//         if(root.left != null) {
//             postOrder(root.left, lst);
//         }
//         if(root.right != null) {
//             postOrder(root.right, lst);
//         }
//         lst.add(root.val);
        
//         return lst;
//     }
}