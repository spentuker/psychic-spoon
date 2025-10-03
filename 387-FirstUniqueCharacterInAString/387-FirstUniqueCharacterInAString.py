# Last updated: 10/3/2025, 2:13:20 PM
class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        d={}
        for ch in s:
            d[ch]=d.setdefault(ch,0)+1
        for i in range(len(s)):
            if(d.get(s[i])==1):
                return i



         
        return -1