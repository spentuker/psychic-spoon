// Last updated: 10/3/2025, 2:12:50 PM
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(n>k+maxPts || k==0) return 1.0;

        double[] dp=new double[k+maxPts+1];
        for(int i=n+1;i<k+maxPts;i++){
            dp[i]=0;
        }
        for(int i=k;i<=n;i++){
            dp[i]=1;
        }

        //1st window 
        double windowSum=0;
        for(int i=k;i<k+maxPts;i++){
            windowSum+=dp[i];
        }
        // System.out.println(dp[k-1]);
        for(int i=k-1;i>=0;i--){
            // dp[i]+=(dp[i+1]/maxPts)-(dp[i+maxPts]/maxPts);
            dp[i]+=(windowSum/maxPts);
            windowSum+=(dp[i])-dp[i+maxPts];
        }

        return dp[0];

    }
}