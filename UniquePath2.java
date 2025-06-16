import java.util.*;

public class UniquePath2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: No obstacles
        int[][] grid1 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Test Case 1: " + sol.uniquePathsWithObstacles(grid1));  // Expected: 6

        // Test Case 2: Obstacle in the middle
        int[][] grid2 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println("Test Case 2: " + sol.uniquePathsWithObstacles(grid2));  // Expected: 2

        // Test Case 3: Start is blocked
        int[][] grid3 = {
            {1, 0},
            {0, 0}
        };
        System.out.println("Test Case 3: " + sol.uniquePathsWithObstacles(grid3));  // Expected: 0

        // Test Case 4: End is blocked
        int[][] grid4 = {
            {0, 0},
            {0, 1}
        };
        System.out.println("Test Case 4: " + sol.uniquePathsWithObstacles(grid4));  // Expected: 0

        // Test Case 5: Single row
        int[][] grid5 = {
            {0, 0, 0, 0}
        };
        System.out.println("Test Case 5: " + sol.uniquePathsWithObstacles(grid5));  // Expected: 1

        // Test Case 6: Single column with obstacle
        int[][] grid6 = {
            {0},
            {0},
            {1},
            {0}
        };
        System.out.println("Test Case 6: " + sol.uniquePathsWithObstacles(grid6));  // Expected: 0
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] Obstacles) {

        
        int m=Obstacles.length;
        int n=Obstacles[0].length;

        if(Obstacles[0][0]==1 || Obstacles[m-1][n-1]==1) return 0; 

        int[][] og=new int[m][n];
        og[0][0]=1;

        //1st row
        for(int i=1;i<n;i++){
            if((og[0][i-1]==1) && Obstacles[0][i]==0)
                og[0][i]=1;
        }

        //1st column
        for(int i=1;i<m;i++){
            if(og[i-1][0]==1 && Obstacles[i][0]==0){
                og[i][0]=1;
            }
        }

        // System.out.println("Before operation");
        // System.out.println(Arrays.deepToString(og));

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                // if(i==0 || j==0) continue;
                if(Obstacles[i][j]==1) continue;
                og[i][j]=og[i-1][j]+og[i][j-1];
            }
        }

        // System.out.println(Arrays.deepToString(og));

        return og[m-1][n-1];
    }
}