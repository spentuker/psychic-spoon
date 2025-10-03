# Last updated: 10/3/2025, 2:13:43 PM
class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        #sum=0
        while( num>9):
            sum=0
            while(num!=0):
             r=num%10
             print(num)
             print(r)
             sum+=r
             num=num/10
            if num==0:
                print(sum)
                num=sum
                sum=0
        return num