import java.util.*;

public class DFSgraph {
    public static void main(String[] args) {
        
        List<List<Integer>> adj=new ArrayList<>();

        //  0 - 1 --> 0 -> 1 && 1 -> 0. 
        //  v = 2 
        for(int i=0; i< 5; i ++ ){

            adj.add(new ArrayList<Integer>());

        }

       adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(1).add(4);
        adj.get(4).add(1);

        boolean[] visited=new boolean[5];

        bfs(0,adj,visited);

    }

    static void dfs(int node,List<List<Integer>> adj,boolean[] visited){

        visited[node]=true;
        System.out.println("We r at node "+ node);
        for(int n:adj.get(node)){
            if(!visited[n])
                dfs(n, adj, visited);
        }


    }

    static void bfs(int node,List<List<Integer>> adj,boolean[] visited){
        Queue<Integer> Q=new LinkedList<>();

        Q.add(node);

        while(!Q.isEmpty()){

            int n=Q.poll();
            visited[n]=true;
            System.out.println("We're currently at node "+ n);

            for(int a:adj.get(n)){
                if(!visited[a]){
                System.out.println(a+"In queue");
                Q.add(a);}
            }

        }
    }
}
