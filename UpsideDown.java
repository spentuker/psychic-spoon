import java.util.*;

class TreeNode {
    Integer val;
    TreeNode left, right;
    
    TreeNode(Integer val) {
        this.val = val;
        this.left = this.right = null;
    }
}
public class UpsideDown {
    
   public static TreeNode buildTree(List<Integer> data) {
    if (data == null || data.isEmpty()) return null;

    TreeNode root = new TreeNode(data.get(0));
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int i = 1;

    while (i + 1 < data.size()) {
        TreeNode current = queue.poll();

        // According to constraints: every node has either 0 or 2 children
        // Add left and right
        TreeNode left = new TreeNode(data.get(i));
        TreeNode right = new TreeNode(data.get(i + 1));

        current.left = left;
        current.right = right;

        // Only add left child to queue because:
        //  - left child might have children
        //  - right child is always a leaf (as per constraints)
        queue.offer(left);

        i += 2;
    }

    return root;
}

    
    static TreeNode upsideDownBinaryTree(TreeNode root){
        TreeNode cur=root;
        int rootNode=root.val;
        System.err.println("root vAL:"+rootNode);
        Stack<Integer> LCQ=new Stack<>();
        Stack<Integer> RCQ=new Stack<>();
        if(isLeaf(cur)){return cur;}
        rightAndLeftChildtrav(cur,RCQ,LCQ);
        // int rootval=root.val;
        // ArrayList<Integer> res=new ArrayList<>();
        // TreeNode rootNode=new TreeNode(LCQ.poll());
        System.out.println("LCQ:"+LCQ);
        System.out.println("RCQ:"+RCQ);

        TreeNode flippedTree=new TreeNode(LCQ.pop());
        
        horizontalFlip(flippedTree,LCQ,RCQ,rootNode);
        // leftChildtrav(cur,LCQ);
        return flippedTree;

    }
    static void horizontalFlip(TreeNode flippedTree,Stack<Integer> LCQ,Stack<Integer> RCQ,int rootNode){
        
        TreeNode cur=flippedTree;
        while(!RCQ.isEmpty()){
            cur.left=new TreeNode(RCQ.pop());
            if(!LCQ.isEmpty()){
            cur.right=new TreeNode(LCQ.pop());
            cur=cur.right;
            }
            else{
                cur.right=new TreeNode(rootNode);
            }
        }
        // List<Integer> res=levelOrderTraversal(cur);
        // System.out.println("Res"+res);
    }
    static void rightAndLeftChildtrav(TreeNode cur,Stack<Integer> RCQ,Stack<Integer> LCQ){
        RCQ.add(cur.right.val);
        System.out.println(cur.right.val+" Added to RCQ");
        cur=cur.left;
        while(cur!=null){
            System.err.println("cur val: "+cur.val);
            LCQ.add(cur.val);
            System.out.println(cur.val+" Added to LCQ");
            // if(cur.val==1){
            // System.out.println("cur right val"+cur.right.val);}
            if(isLeaf(cur)){ System.err.println(cur.val+"is a leaf node- returning now");return;}
            System.out.println(cur.right.val+" Added to RCQ");
            RCQ.add(cur.right.val);
            cur=cur.left;
        }
    }


    static Boolean isLeaf(TreeNode node){
        if(node.right==null && node.left==null){
            return true;
        }
        return false;
    }
    //Write your code here 
    
    static List<Integer> levelOrderTraversal(TreeNode root){
        ArrayList<Integer> al=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode cur=root;
        q.offer(cur);
        while(!q.isEmpty()){
            cur=q.poll();
            al.add(cur.val);
            if(cur.left!=null){
                q.offer(cur.left);
            }
            if(cur.right!=null){
                q.offer(cur.right);
            }
        }
        return al;
    }
    
   public static void main(String[] args) {
    // ✅ Predefined input as a list
    List<Integer> data = Arrays.asList(8,3,4,1,2,9,10);
    // List<Integer> data = Arrays.asList(1);

    // 🌳 Build the tree from the list
    TreeNode root = buildTree(data);

    // 🔄 Flip the tree
    TreeNode flippedRoot = upsideDownBinaryTree(root);

    // 🚀 Level order traversal of the flipped tree
    List<Integer> result = levelOrderTraversal(flippedRoot);

    // 📤 Print the output
    for (int x : result) {
        System.out.print(x + " ");
    }
}

}