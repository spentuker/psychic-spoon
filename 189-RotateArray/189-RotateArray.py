# Last updated: 10/3/2025, 2:14:14 PM
class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        
        n=len(nums)
        
        k=k%n
        if(n<=1 or k==0): return
        nums[:]=nums[-k:]+nums[:n-k]