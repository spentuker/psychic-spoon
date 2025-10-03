# Last updated: 10/3/2025, 2:12:22 PM
class Solution(object):
    def getNoZeroIntegers(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        res=[]
        for i in range(1,n,1):
            if (self.checkZeros(i) and self.checkZeros(n-i)):
                return[i,n-i]

    def checkZeros(self,n):
        while(n>0):
            r=n%10
            if(r==0): return False
            n=n/10
        return True
