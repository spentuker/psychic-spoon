import java.util.*;

// TreeNode definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int qSize=q.size();
            for(int i=0;i<qSize;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);

                if(i==qSize-1){
                    res.add(cur.val);
                }
            }
        }
        

        return res;
    }
}

public class rightViewTree {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Basic tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);
        System.out.println("Right Side View of Tree 1: " + sol.rightSideView(root1)); // Output: [1, 3, 4]

        // Test Case 2: Skewed left
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        System.out.println("Right Side View of Tree 2: " + sol.rightSideView(root2)); // Output: [1, 2, 3]

        // Test Case 3: Skewed right
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);
        System.out.println("Right Side View of Tree 3: " + sol.rightSideView(root3)); // Output: [1, 2, 3]

        // Test Case 4: Single node
        TreeNode root4 = new TreeNode(1);
        System.out.println("Right Side View of Tree 4: " + sol.rightSideView(root4)); // Output: [1]

        // Test Case 5: Empty tree
        TreeNode root5 = null;
        System.out.println("Right Side View of Tree 5: " + sol.rightSideView(root5)); // Output: []
    }
}
