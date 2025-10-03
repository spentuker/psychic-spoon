// Last updated: 10/3/2025, 2:11:56 PM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        int start = 0;
        long currentSum = 0;
        long result = 0;

        for (int end = 0; end < n; end++) {
            currentSum += nums[end];

            // Shrink the window while score is invalid
            while (currentSum * (end - start + 1) >= k) {
                currentSum -= nums[start];
                start++;
            }

            // Count the number of valid subarrays ending at `end`
            result += (end - start + 1);
        }

        return result;
    }
}
