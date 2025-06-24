public class UniquePaths3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        };
        int result = sol.uniquePathsIII(grid);
        System.out.println("Unique Paths: " + result);
    }
}

class Solution {
    int paths=0;
    public int uniquePathsIII(int[][] grid) {
        // your implementation here
        int c=0;int m=0;int n=0;int total=(grid.length*grid[0].length)-2;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    m=i;n=j;
                }

                
            }
        }
        backtrack(grid,m,n,c,total);
        return paths;
    }

    void backtrack(int[][] grid,int i,int j,int c,int total){
        // System.err.println("Tracing Path of "+ i + " "+ j);
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==-1){
        // System.err.println("path aborted, backtracking now..."); 
        return;} 
        if(grid[i][j]==2){
            // System.err.println("Triggered 2 at c= " + c);
            if(total==c){
                System.err.println("new Path found");
                paths++;
            }
            return;
        }

        grid[i][j]=-1;

        // System.err.println("right");
        backtrack(grid, i, j+1, c+1, total);
        // System.err.println("left");
        backtrack(grid, i, j-1, c+1, total);        
        // System.err.println("bottom");
        backtrack(grid, i+1, j, c+1, total);       
        //  System.err.println("top");
        backtrack(grid, i-1, j, c+1, total);
        grid[i][j]=0;

        return;
}
}
