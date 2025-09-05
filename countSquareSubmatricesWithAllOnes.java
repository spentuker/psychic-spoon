public class countSquareSubmatricesWithAllOnes {
    
}


//brute approach
class Solution {
    public int countSquares(int[][] matrix) {
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) continue;
                c++;
                int side=1;
                while(true){
                    if(checkOnes(matrix,i,j,side)){side++; c++;}
                    else break;
                    
                }
            }
        }
        return c;
    }
    boolean checkOnes(int matrix[][],int i,int j,int side){

        int i1=side+i;int j1=side+j;
        if(i1>=matrix.length || j1>=matrix[0].length) return false;
        for(int k=i;k<=i1;k++){
            for(int l=j;l<=j1;l++){
                if(matrix[k][l]==0) return false;
            }
        }
        return true;


    }

}