// Last updated: 10/3/2025, 2:13:58 PM
class Solution {
    public int rob(int[] nums) {
        return Math.max(robber(nums,0,nums.length-2),robber(nums,1,nums.length-1));
    }

    int robber(int[] nums,int start,int end){
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int n=end-start+1;
        int dp[]=new int[n];

        dp[0]=nums[start];
        dp[1]=Math.max(dp[0],nums[start+1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[start + i]+dp[i-2],dp[i-1]);
        }
        // System.out.println(dp[end]);
        return (dp[n-1]);
    }
}