// Last updated: 10/3/2025, 2:12:57 PM
class Solution {
    // boolean[] check;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%k!=0) return false;
        int t_sum=sum/k;

        return partitionHelper(nums,k,0,0,t_sum,new boolean[nums.length]);

    }

    boolean partitionHelper(int[] nums,int k, int i, int subsetSum, int t_sum, boolean[] check){

        if(k==0){
            return true;
        }

        if(subsetSum == t_sum){
            if(partitionHelper(nums,k-1,0,0,t_sum,check)){

                return true;
            }
        }

        for(int j=i; j<nums.length ; j++){
            if(subsetSum+nums[j] <= t_sum && check[j] == false){
                check[j]=true;
                if(partitionHelper(nums,k,j+1,subsetSum+nums[j],t_sum,check))
                    return true;
                check[j]=false;
            }
        }
        return false;
    }
}