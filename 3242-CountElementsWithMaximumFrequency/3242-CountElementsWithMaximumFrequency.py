# Last updated: 10/3/2025, 2:11:45 PM
class Solution(object):
    def maxFrequencyElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq={}
        highest_freq_count=0
        highest_freq=0

        for i in nums:
            freq[i]=freq.setdefault(i,0)+1
            highest_freq=max(freq[i],highest_freq)

        # no=[]
        no=[0 for i in range(101)]

        for i,j in freq.items():
            if(j==highest_freq):
                no[i]=1
        
        for i in nums:
            if(no[i]==1):
                highest_freq_count+=1
        
        return highest_freq_count


            