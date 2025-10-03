// Last updated: 10/3/2025, 2:14:04 PM
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
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int a[]:prerequisites){
            adj.get(a[1]).add(a[0]);
            indeg[a[0]]++;
            // khan(adj);
        }
        
        for(int node=0;node<indeg.length;node++){
            if(indeg[node]==0){
                q.offer(node);
            }
        }
        khan(adj);
        // khan(vis,adj)
        if(index!=numCourses){
            return new int[] {};
        }
        return res;
    }
    void khan(List<List<Integer>> adj){
        // q.offer(node);

        while(!q.isEmpty()){
            int node=q.poll();
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