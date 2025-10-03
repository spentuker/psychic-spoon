# Last updated: 10/3/2025, 2:11:37 PM
class Solution(object):
    def findClosest(self, x, y, z):
        """
        :type x: int
        :type y: int
        :type z: int
        :rtype: int
        """
        fun=lambda: 1 if abs(y-z)>abs(x-z) else (0 if abs(y-z)==abs(x-z) else 2)
        return fun()