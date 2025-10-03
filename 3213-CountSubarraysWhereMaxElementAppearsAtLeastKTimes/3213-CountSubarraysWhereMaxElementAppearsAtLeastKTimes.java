// Last updated: 10/3/2025, 2:11:46 PM
public class Solution {

    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        
        for (int num : nums) {
            max = Math.max(max, num);
        }

        long count = 0;
        int left = 0, right = 0;
        int maxCount = 0;

        while (right < n) {
            if (nums[right] == max) {
                maxCount++;
            }

            while (maxCount >= k) {
                count += n - right;
                if (nums[left] == max) {
                    maxCount--;
                }
                left++;
            }
            right++;
        }

        return count;
    }
}
