public class houseRobber {

    public static void main(String[] args) {
        Solution s=new Solution();
        // Test Case 1
        int[] nums1 = {2, 7, 9, 3, 1};
        System.out.println("Max rob (Test 1): " + s.rob(nums1)); // Expected: 12

        // Test Case 2
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("Max rob (Test 2): " + s.rob(nums2)); // Expected: 4

        // Test Case 3
        int[] nums3 = {5, 5, 10, 100, 10, 5};
        System.out.println("Max rob (Test 3): " + s.rob(nums3)); // Expected: 110
    }
}

class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        // add one edge case and ur set
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }

        return dp[nums.length-1];
    }
}