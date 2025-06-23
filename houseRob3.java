import java.util.*;
public class houseRob3 {


    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: [3,2,3,null,3,null,1]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(1);
        System.out.println(sol.rob(root1)); // Expected output: 7

        // Test Case 2: [3,4,5,1,3,null,1]
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(1);
        System.out.println(sol.rob(root2)); // Expected output: 9

        // Test Case 3: [4]
        TreeNode root3 = new TreeNode(4);
        System.out.println(sol.rob(root3)); // Expected output: 4
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

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