// Last updated: 10/3/2025, 2:13:22 PM
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return csHelper(nums,target,dp);
    }

    int csHelper(int[] nums,int target,int[] dp){
        if(target==0) return 1;
        if(dp[target]!=-1) return dp[target];
        int ways=0;
        for(int num:nums){
            if(num<=target){
                ways+=csHelper(nums,target-num,dp);
                dp[target]=ways;
            }      
        }
        return ways;
    }
}