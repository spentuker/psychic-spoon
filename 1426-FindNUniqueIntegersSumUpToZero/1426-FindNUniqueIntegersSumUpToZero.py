# Last updated: 10/3/2025, 2:12:24 PM
class Solution(object):
    def sumZero(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        c=1
        nums=[]
        while(n>1):
            nums.append(c)
            nums.append(c*(-1))
            n-=2
            c+=1
        if(n==1):
            nums.append(0)
            n-=1
        nums=sorted(nums)
        return nums