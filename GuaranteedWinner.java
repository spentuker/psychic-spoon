import java.util.*;
import java.io.*;

public class GuaranteedWinner {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        int[][] adj = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                adj[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        System.out.println(countWinners(adj, n));
    }
    
    static int countWinners(int[][] adj, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (canWin(i, adj, n)) {
                count++;
            }
        }
        return count;
    }
    
    static boolean canWin(int contestant, int[][] adj, int n) {
        boolean[] eliminated = new boolean[n];
        return solve(contestant, eliminated, adj, n);
    }
    
    static boolean solve(int contestant, boolean[] eliminated, int[][] adj, int n) {
        // Count remaining players
        int remaining = 0;
        for (int i = 0; i < n; i++) {
            if (!eliminated[i]) remaining++;
        }
        
        // Base case: only our contestant left
        if (remaining == 1) return true;
        
        // Try all possible matches between remaining players
        for (int i = 0; i < n; i++) {
            if (eliminated[i]) continue;
            
            for (int j = 0; j < n; j++) {
                if (eliminated[j] || i == j) continue;
                
                // If i can defeat j
                if (adj[i][j] == 1) {
                    eliminated[j] = true;
                    if (solve(contestant, eliminated, adj, n)) {
                        eliminated[j] = false;
                        return true;
                    }
                    eliminated[j] = false;
                }
            }
        }
        
        return false;
    }
}