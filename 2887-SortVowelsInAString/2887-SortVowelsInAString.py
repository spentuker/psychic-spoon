# Last updated: 10/3/2025, 2:11:49 PM
class Solution(object):
    def sortVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        h=[]
        v={'a','A','e','E','i','I','O','o','U','u'}
        for c in s:
            if(v.issuperset(c)):
                h.append(c)
        h=sorted(h)
        j=0
        i=0
        s=list(s)
        while(j<len(s)):
            if(v.issuperset(s[j])):
                s[j]=h[i]
                i+=1
            j+=1
        return "".join(s)