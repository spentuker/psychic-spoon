// Last updated: 10/3/2025, 2:12:35 PM
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

class Tuple{
    int row;
    int val;

    Tuple(int row, int val){
        this.row=row;
        this.val=val;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,ArrayList<Tuple>> hm=new TreeMap<>();
        traverse(root,0,0,hm);

        for(ArrayList<Tuple>  val: hm.values()){
            
            Collections.sort(val,(a,b)->{
                if(a.row == b.row) return a.val-b.val;
                return a.row-b.row;
        });
            List<Integer> li=new ArrayList<>();

            for(Tuple t:val)
            {
                li.add(t.val);
            }
            res.add(li);
            // res.add(val);
        }

        return res;
    }
    void traverse(TreeNode root,int row,int col,TreeMap<Integer,ArrayList<Tuple>> hm){
        if (root==null) return;

        hm.computeIfAbsent(col,k -> new ArrayList<>()).add(new Tuple(row,root.val));

        if(root.left!=null) traverse(root.left,row+1,col-1,hm);
        if(root.right!=null) traverse(root.right,row+1,col+1,hm);  
    }
}