// Last updated: 10/3/2025, 2:13:34 PM
class NumMatrix {
    int dp[][];
    public NumMatrix(int[][] matrix) {
        
        dp=new int[matrix.length+1][matrix[0].length+1];

        dp[1][1]=matrix[0][0];
        for(int i=2;i<=matrix[0].length;i++){
            dp[1][i]=dp[1][i-1]+matrix[0][i-1];
        } 
        for(int i=2;i<=matrix.length;i++){
            dp[i][1]=dp[i-1][1]+matrix[i-1][0];
        }
        // System.out.println(Arrays.deepToString(dp));


        for(int i=2;i<=matrix.length;i++){
            for(int j=2;j<=matrix[0].length;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+matrix[i-1][j-1];
            }
        }
        // System.out.println(Arrays.deepToString(dp));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    row1++;col1++;row2++;col2++;
    int sum=dp[row2][col2]-dp[row2][col1-1]-dp[row1-1][col2]+dp[row1-1][col1-1];
    return sum;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */