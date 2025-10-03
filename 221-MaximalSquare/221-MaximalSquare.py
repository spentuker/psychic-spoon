# Last updated: 10/3/2025, 2:13:52 PM

class Solution(object):
    def maximalSquare(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        m=len(matrix)
        n=len(matrix[0])
        mat=[[0]*n for _ in range(m)]
        for i in range (m):
            for j in range (n):
                if matrix[i][j]=='1':
                    mat[i][j]=1

        # print(mat)
        mac=0
        for i in range (1,m):
            for j in range(1,n):
                if(mat[i][j]==0): continue
                mat[i][j]+=min(mat[i-1][j],mat[i][j-1],mat[i-1][j-1])
                # mac=max(mac,mat[i][j])
        for i in range(m):
            for j in range(n):
                mac=max(mac,mat[i][j])
        return mac**2