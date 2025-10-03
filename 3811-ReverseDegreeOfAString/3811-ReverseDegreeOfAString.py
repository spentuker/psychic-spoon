# Last updated: 10/3/2025, 2:11:34 PM
class Solution(object):
    def reverseDegree(self, s):
        """
        :type s: str
        :rtype: int
        """
        lst=list(s)
        # res=''
        j=1
        val_rev_prod=0
        for i in lst:
            val=ord(i)
            val-=97
            val_rev=26-val
            val_rev_prod+=(j*val_rev)
            j+=1

        return val_rev_prod