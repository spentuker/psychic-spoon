# Last updated: 10/3/2025, 2:12:06 PM
class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        s=[0 for i in range(26)]
        for c in sentence:
            s[ord(c)-ord('a')]+=1
        for i in s:
            if(i==0):
                return False
        return True