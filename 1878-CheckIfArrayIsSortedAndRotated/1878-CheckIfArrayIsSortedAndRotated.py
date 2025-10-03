# Last updated: 10/3/2025, 2:12:09 PM
class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        c=0
        n=len(nums)
        for i in range(len(nums)):
            if(nums[i]>nums[(i+1)%n]):
                c+=1
        if(c>1):
            return False
        return True