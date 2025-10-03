# Last updated: 10/3/2025, 2:13:55 PM
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        d={}
        for i in range(len(nums)):
            if nums[i] in d:
                return True
            d[nums[i]]=1
        return False