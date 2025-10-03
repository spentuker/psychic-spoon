// Last updated: 10/3/2025, 2:12:43 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length+1][matrix[0].length+2];

        for(int i=0;i<dp.length;i++){        
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                dp[i+1][j+1]=matrix[i][j];
            }
        }

        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<=matrix[0].length;j++){
                // System.out.println("For i: "+i+"For j: "+j);
                dp[i+1][j]+=Math.min(dp[i][j-1],Math.min(dp[i][j],dp[i][j+1]));
            }
        }
        int minPath=Integer.MAX_VALUE;

        for(int i=1;i<=matrix[0].length;i++){
            
            minPath=Math.min(minPath,dp[dp.length-1][i]);

        }
        
        // for(int i=0;i<dp.length;i++){
        //             for(int j=0;j<dp[0].length;j++){
        //                 System.out.print(dp[i][j]+" ");
        //             }
        //             System.out.println();
        //         }
        return minPath;



    }
}