import java.util.*;

class Solution {
    List<Integer> nodes = new ArrayList<>(1000);
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        //WRITE YOUR CODE HERE AND RETURN THE LIST OF NODES
        List<Integer> res=new ArrayList<>();

        if(root!=null) res.add(root.val);

        leftBoundary(root,res);
        System.out.println("Left boundary"+res);

        leafBoundary(root,res);
        System.out.println("leaf boundary"+res);

        ArrayList<Integer> al=rightBoundary(root,res);
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
            System.err.println("Traversing"+cur.val);
            if(isLeaf(cur) || isLeaf(cur.left) || isLeaf(cur.right)){
                System.out.println(cur.val+"Triggered as leaf");
                return;
            }

            if(cur.left!=null && !isLeaf(cur.left)){
                res.add(cur.left.val);
                System.out.println("Added"+cur.left.val);
                cur=cur.left;
                System.err.println("Switching to"+ cur.val);
            }
            else{
                if(cur.right!=null && !isLeaf(cur.right)){
                    System.out.println("LEft is null");
                    res.add(cur.right.val);
                    System.out.println("Added"+ cur.right.val);
                    cur=cur.right;
                    System.out.println("Switched to"+ cur.val);
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

        while(cur != null){
            System.err.println("in this");
            if(isLeaf(cur) || isLeaf(cur.left) || isLeaf(cur.right)){
                // al.add(cur.val);


                return al;
            }
            if(cur.right!=null){
                System.out.println("Adding & switching to"+cur.right.val);
                al.add(cur.right.val);
                cur=cur.right;
            }
            else{
                if(cur.left!=null){
                    System.out.println(" As there is no right boundary, Adding & switching to"+cur.right.val);
                    al.add(cur.left.val);
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

public class BT_boundary{
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
