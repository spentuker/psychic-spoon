// Last updated: 10/3/2025, 2:13:10 PM
class Solution {
    int c=0; 
     
    public int findTargetSumWays(int[] nums, int target) {
        bt(nums,0,target);
        return c;
    }
    void bt(int[] nums, int idx, int target){
        if(idx==nums.length){
            if(target==0){
                c+=1;
                
            }
            return;
        }
        bt(nums,idx+1,target-nums[idx]);
        bt(nums,idx+1,target+nums[idx]);
    }
}