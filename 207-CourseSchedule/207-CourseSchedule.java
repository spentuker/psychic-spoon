// Last updated: 10/3/2025, 2:14:07 PM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // build an adjList
        List<List<Integer>> adjL=new ArrayList<>(numCourses);
        for(int i=0;i<numCourses;i++){
            adjL.add(new ArrayList<>());
        }        

        for(int a[]:prerequisites){
            int u=a[0];
            int v=a[1];

            adjL.get(v).add(u);

        }

        boolean[] visited=new boolean[numCourses];
        boolean[] inpath=new boolean[numCourses];

        // System.out.println(adjL);

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                // System.out.println("For i"+i);
                if(adjL.get(i).size()==0) continue;
                if(dfs(i,adjL,visited,inpath)){
                    return false;
                }
            }
        }
        return true;
    }

    boolean dfs(int node,List<List<Integer>> adjL,boolean[] visited,boolean[] inpath){

        visited[node]=true;
        inpath[node]=true;
        for(int a:adjL.get(node)){
            if(!visited[a]){
                if(dfs(a,adjL,visited,inpath)){
                    return true;
                }
            }
            else if(inpath[a]){
                return true;
            }
            /*
            if(visited[a]){
                if(inpath[a]){
                    return true;
                }
                else{
                    // inpath[a]=true;
                    if(dfs(a,adjL,visited,inpath)){
                        return true;
                    }
                    else{
                        inpath[a]=false;
                        return false;
                    }
                }
            }*/
        }
        inpath[node]=false;

        return false;
    }
}