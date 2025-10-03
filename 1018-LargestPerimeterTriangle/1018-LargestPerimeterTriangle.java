// Last updated: 10/3/2025, 2:12:41 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<(nums[i-1]+nums[i-2]))
                return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}