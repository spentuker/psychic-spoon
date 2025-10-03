// Last updated: 10/3/2025, 2:14:28 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        helperfun(root,al);
        return al;
    }
    void helperfun(TreeNode root,ArrayList al){
        TreeNode cur=root;
        if(cur==null) return;
        al.add(cur.val);
        helperfun(root.left,al);
        helperfun(root.right,al);
    }
}