import java.util.*;

class Solution {
    List<Integer> nodes = new ArrayList<>(1000);
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        //WRITE YOUR CODE HERE AND RETURN THE LIST OF NODES
        List<Integer> res=new ArrayList<>();

        if(root==null) return res;

        res.add(root.val);
        leftBoundary(root.left,res);
        System.out.println("After Left boundary"+res);

        leafBoundary(root,res);
        System.out.println("After leaf boundary"+res);

        ArrayList<Integer> al=rightBoundary(root.right,res);
        Collections.reverse(al);
        for(int a:al){
            res.add(a);
        }
        System.out.println("Right boundary"+res);
        
        return res;


    }
    void leftBoundary(TreeNode root,List<Integer> res){
        TreeNode cur=root;
        while(cur!=null){
           

            if(isLeaf(cur)){
                System.err.println(cur.val+"Declared as a leaf node, Returning from left boundary function now.");
                return;
            }

            res.add(cur.val);
            System.err.println(cur.val+"Added into the arraylist");

            if(cur.left!=null){
                System.err.println("Switching to left node,");
                cur=cur.left;
            }
            else{
                if(cur.right!=null){
                    System.err.println(cur.val+"Does not have a left node, switching to right node of it.");
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
    ArrayList<Integer> rightBoundary(TreeNode root,List<Integer> res){

        ArrayList<Integer> al=new ArrayList<>();
        TreeNode cur=root;
        System.err.println("Switched to "+ cur + "Before loop");

        while(cur != null){
            if(isLeaf(cur)){
                System.err.println("Declared as a leaf, returning from right boundary now.");
                return al;
            }
            al.add(cur.val);
            System.err.println("Added "+cur.val);
            if(cur.right!=null){
                System.err.println("Switched to"+cur.right.val);
                cur=cur.right;
            }
            else{
                if(cur.left!=null){
                    System.err.println("Right was null, switching to "+cur.left.val);
                    cur=cur.left;
                }
            }

        }
        return al;
        // System.out.println("Right bound. AL"+al);
        // Collections.reverse(al);
        // for(int a:al){
        //     res.add(a);
        // }

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

public class BoundaryofTree{
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
	public static void main(String args[])
	{
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> data = new ArrayList<>();
        for(String s:input) {
            data.add(Integer.parseInt(s));
        }
        scanner.close();
        TreeNode root = buildTree(data);

		System.out.println(new Solution().boundaryOfBinaryTree(root));
	}
}
