// Last updated: 10/3/2025, 2:14:26 PM
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
        List<Integer> al=new ArrayList<>();
        helper(root,al);
        return al;
    }
    void helper(TreeNode root,List al){
        if(root==null) return;
        helper(root.left,al);
        helper(root.right,al);
        al.add(root.val);
    }
}