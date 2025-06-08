import java.util.*;
class Solution
{
	public List<List<Integer>> verticalOrder(TreeNode root) {
		//WRITE YOUR CODE HERE AND RETURN THE LIST
        List<List<Integer>> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        Queue<TreeNode> nq=new LinkedList<>();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        TreeNode current=root;
        if(current==null) return res;

        int col=0;
        q.offer(col);
        nq.offer(current);

        while(!q.isEmpty()){
            col=q.poll();
            current=nq.poll();
            // hm.put(col, ArrayList<Integer>().add(current.val));
            //hm.computeIfAbsent(col, )
            hm.computeIfAbsent(col, k-> new ArrayList<>()).add(current.val);
            if(current.left!=null){
                q.offer(col-1);
                nq.offer(current.left);
            }
            if(current.right!=null){
                q.offer(col+1);
                nq.offer(current.right);
            }
                        // hm.put(col, ArrayList<Integer>().add(current.val))
        }
             ArrayList<Integer> keys=new ArrayList<>(hm.keySet());
            // List<List<Integer>> res=new ArrayList<>();
            Collections.sort(keys);
            for(int key:keys){
                res.add(hm.get(key));
            }
            return res;
	}
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class VerticalOrder {
    
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
        // Hardcoded test case: [1, 2, 3, 4, 5, -1, 6]
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, -1, 6);
        
        TreeNode root = buildTree(data);
        List<List<Integer>> result = new Solution().verticalOrder(root);
        
        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
