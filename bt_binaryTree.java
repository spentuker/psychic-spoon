import java.util.*;

class Solution {
    List<Integer> nodes = new ArrayList<>(1000);
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        //WRITE YOUR CODE HERE AND RETURN THE LIST OF NODES
        List<Integer> res=new ArrayList<>();

        if(root!=null) res.add(root.val);

        leftBoundary(root,res);System.out.println(res);

        leafBoundary(root,res);System.out.println(res);

        rightBoundary(root,res);System.out.println(res);
        
        return res;


    }
    void leftBoundary(TreeNode root,List<Integer> res){
        TreeNode cur=root;
        while(cur!=null){
            System.err.println("Traversing"+cur.val);
            if(isLeaf(cur)){System.out.println(cur.val+"Triggered as leaf");return;}

            if(cur.left!=null && !isLeaf(cur.left)){
                res.add(cur.left.val);
                System.out.println("Added"+cur.left.val);
                cur=cur.left;
            }
            else{
                if(cur.right!=null){
                    System.out.println("LEft is null");
                    res.add(cur.right.val);
                    System.out.println("Added"+ cur.right.val);
                    cur=cur.right;
                }
            }
        }
    }
    void leafBoundary(TreeNode root,List<Integer> res){
            TreeNode cur=root;
            if(cur==null) return;
            if(isLeaf(cur)) res.add(cur.val);
            leafBoundary(cur.left, res);
            leafBoundary(cur.right, res);
    }
    void rightBoundary(TreeNode root,List<Integer> res){

        List<Integer> al=new ArrayList<>();
        TreeNode cur=root;

        while(cur != null){
            if(isLeaf(cur)){
                // al.add(cur.val);
                return;
            }
            if(cur.right!=null){
                al.add(cur.right.val);
                cur=cur.right;
            }
            else{
                if(cur.left!=null){
                    al.add(cur.left.val);
                    cur=cur.left;
                }
            }
        }
        Collections.reverse(al);
        for(int a:al){
            res.add(a);
        }

    }
    boolean isLeaf(TreeNode root){
        if(root.left == null && root.right ==null){
            return true;
        }
        return false;
    }
}

class TreeNode {
    Integer val;
    TreeNode left, right;
    
    TreeNode(Integer val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class bt_binaryTree{
	public static TreeNode buildTree(List<Integer> data) {
        if (data.isEmpty() || data.get(0) == -1) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(data.get(0));
        queue.offer(root);
        
        int i = 1;
        while (i < data.size()) {
            TreeNode current = queue.poll();
            
            if (i < data.size() && data.get(i) != -1) {
                current.left = new TreeNode(data.get(i));
                queue.offer(current.left);
            }
            i++;
            
            if (i < data.size() && data.get(i) != -1) {
                current.right = new TreeNode(data.get(i));
                queue.offer(current.right);
            }
            i++;
        }
        
        return root;
    }
	 public static void main(String[] args) {
        // Level-order input: 1 2 3 4 5 -1 6 -1 -1 7 8
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, -1, 6, -1, -1, 7, 8);
    
        TreeNode root = buildTree(data);
        List<Integer> boundary = new Solution().boundaryOfBinaryTree(root);

        System.out.println("Boundary Traversal: " + boundary);
    }
}
