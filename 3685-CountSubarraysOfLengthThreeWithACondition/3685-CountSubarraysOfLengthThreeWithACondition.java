// Last updated: 10/3/2025, 2:11:41 PM
public class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 3; i++) {

            if(nums[i]+nums[i+2]==((float)nums[i+1]/2)) count++; 
        }
        return count;
    }
}
