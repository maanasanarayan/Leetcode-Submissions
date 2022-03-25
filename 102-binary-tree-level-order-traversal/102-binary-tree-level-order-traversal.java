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
    
    //Recursive Solution
    /*
    public List<List<Integer>> levels = new ArrayList<>();
    
    private void helper(TreeNode node, int level) {
        if(levels.size() == level) {
            levels.add(new ArrayList<>());
        }    
        levels.get(level).add(node.val);
        
        if(node.left != null) {
            helper(node.left, level + 1);
        }
        if(node.right != null) {
            helper(node.right, level + 1);
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        helper(root, 0);
        return levels;
    }
    */
    
    //Iterative solution
    public List<List<Integer>> levels = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        
        while(!queue.isEmpty()) {
            levels.add(new ArrayList<>());
            int level_len = queue.size();
            
            for(int i = 0; i < level_len; i++) {
                TreeNode temp = queue.remove();
                levels.get(level).add(temp.val);
                
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            level++;
        }
        
        return levels;
    }
}