# Last updated: 10/3/2025, 2:13:17 PM
class Solution(object):
    dic={}

    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """

        s=0
        for i in range(len(nums)):
            s+=nums[i]
        if(s%2!=0):
            return False
        
        tar=s//2
        self.dic={}
        return self.rec(tar,0,0,nums)

    def rec(self,tar,s,idx,nums):

        if(idx==len(nums)):
            return False

        # print(s+nums[idx])
        if(s+nums[idx]==tar):
            return True
        
        if(s>tar):
            return False

        if((idx,s) in self.dic):
            return self.dic[(idx,s)]
        
        take=self.rec(tar,s+nums[idx],idx+1,nums)
        not_take=self.rec(tar,s,idx+1,nums)
        self.dic[(idx,s)]=take or not_take
        return self.dic[(idx,s)]



