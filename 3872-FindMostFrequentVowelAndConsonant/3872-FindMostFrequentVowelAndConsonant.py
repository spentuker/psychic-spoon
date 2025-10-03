# Last updated: 10/3/2025, 2:11:32 PM
class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        vowels=['a','e','i','o','u']
        vow={}
        cons={}
        for c in s:
            if(c in vowels):
                vow[c]=vow.get(c,0)+1
            else:
                cons[c]=cons.get(c,0)+1
        max_vow=0
        max_cons=0

        for j,i in vow.items():
            max_vow=max(max_vow,i)
        for j,i in cons.items():
            max_cons=max(max_cons,i)
        
        return max_vow+max_cons