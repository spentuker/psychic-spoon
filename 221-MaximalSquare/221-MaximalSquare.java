// Last updated: 10/3/2025, 2:13:56 PM
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSquare[][]=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                  if(matrix[i][j]=='1')
                     maxSquare[i][j]=1;
           }
        }


        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='0') continue;
                maxSquare[i][j]+=Math.min(maxSquare[i-1][j-1],Math.min(maxSquare[i-1][j],maxSquare[i][j-1]));
            }   
        }
       int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max=Math.max(max,maxSquare[i][j]);
            }
        }
        // System.out.println(Arrays.deepToString(maxSquare));
        // return (int)Math.pow(maxSquare[matrix.length-1][matrix[0].length-1],2);
        return (int)Math.pow(max,2);
    }
}