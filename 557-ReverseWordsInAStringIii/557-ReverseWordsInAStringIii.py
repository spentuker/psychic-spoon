# Last updated: 10/3/2025, 2:13:04 PM
class Solution(object):
    def rev(self,lst,i,j):
            print("i is",i)
            print("j is",j)     
            while(i<j):
                t=lst[i]
                lst[i]=lst[j]
                lst[j]=t
                i+=1
                j-=1
            return lst
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        i=0
        j=len(s)-1
        lst=list(s)
        j=0
        res=''
        for i in range(1,len(s)):
            if(lst[i]==' '):
                print("i at ",i)
                print("j at ",j)
                self.rev(lst,j,i-1)
                #res=res+''.join(s)
                j=i+1
        self.rev(lst,j,i)
        return "".join(lst)
    
   

        