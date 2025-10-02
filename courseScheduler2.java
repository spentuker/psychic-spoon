class courseScheduler2{
    
}
class Solution {
    boolean[] vis;
    int[] indeg;
    int[] res;
    int index=0;
    Queue<Integer> q=new LinkedList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        vis=new boolean[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        indeg=new int[numCourses];
        res=new int[numCourses];

        for(int a[]:prerequisites){
            adj.get(a[1]).add(0);
            indeg[a[0]]++;
            // khan(adj);
        }
        
        for(int node=0;node<indeg.length;node++){
            if(node==0{
                khan(node,adj);
            }
        }
        // khan(vis,adj)
    }
    void khan(int node,List<List<Integer>> adj){
        q.offer(node);

        while(!q.isEmpty()){
            node=q.pop();
            res[index++]=node;
            for(int nei:adj.get(node)){
                indeg[nei]--;
                if(indeg[nei]==0){
                    q.offer(nei);
                }
            }
        }
    }
}