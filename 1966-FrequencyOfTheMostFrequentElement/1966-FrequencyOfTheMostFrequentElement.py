# Last updated: 10/3/2025, 2:12:05 PM
class Solution(object):
    def maxFrequency(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        ps=0
        m=0

        nums=sorted(nums)
        # r=0
        l=0
        for r in range(len(nums)):
            ps+=nums[r]
            ts=(r-l+1)*nums[r]
            if(ts-ps<=k):
                m=max(m,r-l+1)
            else:
                ps-=nums[l]
                ts-=nums[r]
                l+=1

        return m