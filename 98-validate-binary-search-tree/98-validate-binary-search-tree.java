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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderArr = new ArrayList<>();
        inOrder(root, inOrderArr);
       
        for(int i = 1; i < inOrderArr.size(); i++) {
            if(inOrderArr.get(i) <= inOrderArr.get(i-1)) {
               return false; 
            }
        }
        
        return true;
    }
    
    private void inOrder(TreeNode root, List<Integer> lst) {
        if(root == null) return;
        inOrder(root.left, lst);
        lst.add(root.val);
        inOrder(root.right, lst);
        return;
    }
}