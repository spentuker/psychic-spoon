// Last updated: 10/3/2025, 2:14:37 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][] = new int[triangle.size()][triangle.size()];


        // for(int i=0;i<triangle.length;i++){
        //     for(int j=0;j<traingle[i].length;j++){
        //         dp[i][j]=triangle[i][j];
        //     }
        // }
        for(int i=0;i<triangle.size();i++){
            List<Integer> lst=triangle.get(i);
            for(int j=0;j<lst.size();j++){
                dp[i][j]=lst.get(j);
            }
        }
        if(dp.length==1) return dp[0][0];
        for(int i=0;i<triangle.get(1).size();i++){
            dp[1][i]=dp[0][0]+dp[1][i];
        }
        for(int i=2;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                int diag=0;
                int up=0;
                if(j>=triangle.get(i-1).size())
                    up=Integer.MAX_VALUE;
                else
                    up=dp[i-1][j];
                if(j-1<0)
                    diag=Integer.MAX_VALUE;            
                else 
                    diag=dp[i-1][j-1];
                // if(!(j-1<0)) 
                    // diag=dp[i-1][j-1];
                // System.out.println("up"+up);
                // System.out.println("diag"+diag);
                dp[i][j]+=Math.min(up,diag);
                // else dp[i][j]+=up+diag;
            }
        }
        int min=Integer.MAX_VALUE;

        for(int i=0;i<triangle.get(triangle.size()-1).size();i++){
            // if(dp[dp.length-1][i]==0) continue;
            min=Math.min(dp[dp.length-1][i],min);
        }
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[i].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return min;
    }
}