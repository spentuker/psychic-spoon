# Last updated: 10/3/2025, 2:14:34 PM
class Solution(object):
    def reverse(self,s):
        
        return s
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        og=s= re.sub('[^a-zA-Z0-9]',"",s)
        og=s= re.sub('_',"",s)

        og=og.lower()
        # rev=reverse(og)
        s=og
        l,r=0,len(s)-1
        s=list(s)
        while(l<r):
            t=s[l]
            s[l]=s[r]
            s[r]=t
            l+=1
            r-=1
        s=''.join(s)
        print(s,og)
        return og==s
    
