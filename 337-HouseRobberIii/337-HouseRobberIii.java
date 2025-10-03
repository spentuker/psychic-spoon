// Last updated: 10/3/2025, 2:13:28 PM
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
class Solution{
       public int rob(TreeNode root) {
        // Assume implementation is provided here

        int options[]= travel(root);
        
        return Math.max(options[0],options[1]);

    }

    int[] travel(TreeNode root){
        if(root == null) return new int[2];

        int[] left_node_options=travel(root.left);
        int[] right_node_options=travel(root.right);

        int options[]=new int[2];

        options[0]=root.val+left_node_options[1]+right_node_options[1];
        options[1]=Math.max(left_node_options[0],left_node_options[1])+Math.max(right_node_options[0], right_node_options[1]);

        return options;
    }
}