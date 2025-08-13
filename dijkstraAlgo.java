import java.util.*;

// This class is used to hold (distance, node)
class Pair {
    int distance;
    int node;

    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

class djkstraAlgo {
    // Dijkstra's Algorithm Function
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        // Distance array to hold shortest distances from source S to all other nodes
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9); // initialize all distances to infinity
        dist[S] = 0; // distance to source is 0

        // Priority queue (min-heap) that sorts by distance
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        pq.add(new Pair(0, S)); // start from source

        // Process the queue
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int dis = curr.distance;
            int node = curr.node;

            // Check all neighbours of the current node
            for (int i = 0; i < adj.get(node).size(); i++) {
                int adjNode = adj.get(node).get(i).get(0);     // destination node
                int edgeWeight = adj.get(node).get(i).get(1);  // weight of edge

                // If a shorter path is found
                if (dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }

        return dist;
    }

    // Driver method to test the code
    public static void main(String[] args) {
        int V = 4; // number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Add undirected edges: u <-> v with weight w
        // 0-1 (4), 0-2 (1), 1-3 (2), 2-3 (1)

        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 4)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(2, 1)));

        adj.get(1).add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(3, 2)));

        adj.get(2).add(new ArrayList<>(Arrays.asList(0, 1)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 1)));

        adj.get(3).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(2, 1)));

        // Run Dijkstra's from source node 0
        int[] result = dijkstra(V, adj, 0);

        // Output the result
        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Node " + i + ": " + result[i]);
        }
    }
}
 
