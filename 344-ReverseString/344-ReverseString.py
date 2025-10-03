# Last updated: 10/3/2025, 2:13:27 PM
class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        i=0
        j=len(s)-1

        while(i<j):
            t=s[i]
            s[i]=s[j]
            s[j]=t
            i+=1
            j-=1
        return s
