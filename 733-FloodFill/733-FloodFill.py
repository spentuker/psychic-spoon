# Last updated: 10/3/2025, 2:12:56 PM
class Solution(object):
    og_color=0
    def dfs(self,i,j,sr,sc,color,image):
        
        if(i>= len(image) or j>= len(image[0])): return
        if(i<0 or j<0): return 
        if(image[i][j]!=self.og_color): return
        # print(self.og_color)
        image[i][j]=color

        self.dfs(i+1,j,sr,sc,color,image)
        self.dfs(i-1,j,sr,sc,color,image)
        self.dfs(i,j+1,sr,sc,color,image)
        self.dfs(i,j-1,sr,sc,color,image)

        return image
    
    def floodFill(self, image, sr, sc, color):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type color: int
        :rtype: List[List[int]]
        """
        self.og_color=image[sr][sc]
        if(self.og_color==color):
            return image
        return self.dfs(sr,sc,sr,sc,color,image)
