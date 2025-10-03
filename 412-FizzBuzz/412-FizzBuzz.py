# Last updated: 10/3/2025, 2:13:16 PM
class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        lst=[]
        for i in range(1,n+1):
            if(i%15==0):
                lst.append("FizzBuzz")
            elif(i%5==0):
                lst.append("Buzz")
            elif(i%3==0):
                lst.append("Fizz")
            else:
                lst.append(str(i))
            # lst.append()
        return lst