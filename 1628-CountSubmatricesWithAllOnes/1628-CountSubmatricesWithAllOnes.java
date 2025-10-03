// Last updated: 10/3/2025, 2:12:19 PM
 class Solution {
    public int numSubmat(int[][] mat) {
        int dp[][]=new int[mat.length][mat[0].length];
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count+=res(mat,i,j);
                }
            }
        }
        return count;
    }

    int res(int[][] mat,int i,int j){
        int res=0;
        int minW=mat[0].length;
        for(int r=i;r<mat.length;r++){
            if(mat[r][j]==0) break;
            int w=0;
            for(int c=j;c<mat[0].length;c++){
                if(mat[r][c]==0) break;
                w++;
            }
            minW=Math.min(w,minW);
            res+=minW;
        }
        return res;
    }

   
}