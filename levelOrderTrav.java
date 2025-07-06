import java.util.*;

public class levelOrderTrav {
    public static void main(String[] args) {
        // Create a sample binary tree:
        //       3
        //      / \
        //     9  20
        //        / \
        //       15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left=new TreeNode(24);
        root.left.right=new TreeNode(48);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}

// TreeNode class for reference
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        traverse(root,res);
        return res;
    }

    List<List<Integer>> traverse(TreeNode root, List<List<Integer>> res){

        TreeNode cur;
        Queue<TreeNode> Q=new LinkedList<>();

        if(root==null) return new ArrayList<List<Integer>>();

        Q.add(root);

        while(!Q.isEmpty()){

            // cur=Q.poll();
            int sizeQ=Q.size();
            List<Integer> al=new ArrayList<>();

            for(int i=0;i<sizeQ;i++){
                cur=Q.poll();
                al.add(cur.val);
                if(cur.left!=null) Q.add(cur.left);
                if(cur.right!=null) Q.add(cur.right);
            }
            res.add(al);


        }
        return res;
    } 
}