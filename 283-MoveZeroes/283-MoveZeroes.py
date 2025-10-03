# Last updated: 10/3/2025, 2:13:39 PM
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        j=0
        # while(nums[j]!=0):
        #     j+=1
        z=0
        for i in range(len(nums)):
            # print("itr ",i,nums)
            if (nums[i]==0):
                z+=1
                j=i
                while(j<len(nums)-1 and nums[j]==0):
                    j+=1
                nums[i]=nums[j]
                nums[j]=0
        
        # for i in range(len(nums)-z-1,len(nums)):
        #     nums[i]=0
        

        
        

