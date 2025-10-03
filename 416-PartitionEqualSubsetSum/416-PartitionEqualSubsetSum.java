// Last updated: 10/3/2025, 2:13:23 PM
class Solution {
    
    int sum;
    Boolean[][] checked;
    public boolean canPartition(int[] nums) {
        for(int i: nums){
            sum+=i;
        }
        if(sum%2 != 0 ) return false;
        sum=sum/2; 
        checked=new Boolean[nums.length][sum+1];
        return helper(nums,0,0);
    }

    boolean helper(int[] nums,int idx,int subsetSum){
        if(subsetSum == sum){
            return true;
        }
        if(subsetSum>sum || idx==nums.length){
            return false;
        }
        if(checked[idx][subsetSum]!=null) return checked[idx][subsetSum];
        boolean pick=helper(nums,idx+1,subsetSum+nums[idx]);
        boolean not_pick=helper(nums,idx+1,subsetSum);

        return checked[idx][subsetSum] = pick || not_pick;

    }
}