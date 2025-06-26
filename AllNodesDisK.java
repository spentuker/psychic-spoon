/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // build a child-parent hashmap.    
        HashMap<TreeNode,TreeNode> pc=new HashMap<>();
        childParent(pc,root);
        
        //traversenow
        List<Integer> res=new ArrayList<>();
//         for (Map.Entry<TreeNode, TreeNode> entry : pc.entrySet()) {
//         TreeNode child = entry.getKey();
//         TreeNode parent = entry.getValue();
//         System.out.println("Child: " + (child != null ? child.val : "null") +
//                         ", Parent: " + (parent != null ? parent.val : "null"));
// }

        boolean visited[]=new boolean[500];
        traverse(res,target,pc,0,k,visited);
        return res;

    }

    void traverse(List<Integer> res,TreeNode target,HashMap<TreeNode,TreeNode> pc,int d,int k,boolean[] visited){
        // System.out.println("Traversing "+target.val);
        if(visited[target.val]==true){ return;}
        visited[target.val]=true;
        if(target==null) return;
        if(d==k){
            res.add(target.val);
            return;
        }

        if(target.left!=null) traverse(res,target.left,pc,d+1,k,visited);
        if(target.right!=null) traverse(res,target.right,pc,d+1,k,visited);
        if(pc.containsKey(target)) traverse(res,pc.get(target),pc,d+1,k,visited);
        // else System.out.println("Not visiing parent lmao");

    }

    void childParent(HashMap<TreeNode,TreeNode> pc, TreeNode root){

        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);

        while(!Q.isEmpty()){

            TreeNode cur=Q.poll();
            if(cur.left!=null){
                pc.put(cur.left,cur);
                Q.add(cur.left);
            }
            if(cur.right!=null){
                pc.put(cur.right,cur);
                Q.add(cur.right);

            }
        }
    }
}