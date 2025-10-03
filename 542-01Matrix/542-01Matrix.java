// Last updated: 10/3/2025, 2:13:05 PM
class Pair{
    int one;
    int two;
    int three;
    Pair(int one,int two,int three){
        this.one=one;
        this.two=two;
        this.three=three;
    }
}


class Solution {
    
    public int[][] updateMatrix(int[][] mat) {
        boolean[][] vis=new boolean[mat.length][mat[0].length];
        int[][] res=new int[mat.length][mat[0].length];
        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    res[i][j]=0;
                    // vis[i][j]=true;
                    // System.out.println("OFerring "+i+" "+j);
                    q.offer(new Pair(i,j,0));
                }
            }
        }

        int[] delrow={-1,0,1,0};
        int[] delcol={0,-1,0,1};
        
        while(!q.isEmpty()){

            Pair p=q.poll();
        
            int r=p.one;
            int c=p.two;
            int d=p.three;

            // System.out.println("We just popped "+r+" "+c+"AT dist "+d);
            if(vis[r][c]==true) continue;
            
            res[r][c]=d;
            vis[r][c]=true;

            for(int i=0;i<4;i++){
                if(r+delrow[i]>=mat.length || r+delrow[i]<0 || c+delcol[i]>=mat[0].length || c+delcol[i]<0)
                {
                    // System.out.println("Rejecting"+ (r+delrow[i])+" "+(c+delcol[i]));
                    continue;
                }
                // System.out.println("Adding "+ (r+delrow[i])+ " "+(c+delcol[i]));
                q.offer(new Pair(r+delrow[i],c+delcol[i],d+1));
            }



        }

        return res;

    }
}