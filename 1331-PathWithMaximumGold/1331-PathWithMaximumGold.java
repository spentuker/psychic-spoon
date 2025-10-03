// Last updated: 10/3/2025, 2:12:29 PM
class Solution {
    int max_gold=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    // int temp=grid[i][j];
                    // grid[i][j]=0;
                    backtrack(grid,i,j,0);
                    // grid[i][j]=temp;
                }
            }
        }
        return max_gold;
    }

    void backtrack(int[][] grid,int i,int j,int sum){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return;

        sum+=grid[i][j];

        int t=grid[i][j];
        grid[i][j]=0;
        backtrack(grid,i-1,j,sum);
        backtrack(grid,i+1,j,sum);
        backtrack(grid,i,j-1,sum);
        backtrack(grid,i,j+1,sum);
        grid[i][j]=t;

        max_gold=Math.max(max_gold,sum);
        
    }
}