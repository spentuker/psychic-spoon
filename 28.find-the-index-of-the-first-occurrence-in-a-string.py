#
# @lc app=leetcode id=28 lang=python
#
# [28] Find the Index of the First Occurrence in a String
#

# @lc code=start
class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(haystack)<len(needle): return -1
        t=-1

        for i in range(len(haystack)-len(needle)+1):
            if(haystack[i]==needle[0]):
                t=i
                j=i
                for k in range(0,len(needle)):
                    if(haystack[j]!=needle[k]):
                        # print("triggered at",i)
                        t=-1
                        break
                    j+=1
                   
                if(t!=-1):
                    return t
        return t
        
# @lc code=end
            
# shailesh needle=abc