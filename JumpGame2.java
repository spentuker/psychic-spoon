//DP Medium 45. Jump Game II
//https://leetcode.com/problems/jump-game-ii/description/
/*
You are participating in a futuristic space exploration mission where you must navigate through a series of planets aligned in a straight line.
The planets are numbered from 0 to n-1, and you start your journey on planet 0.

You are given a 0-indexed array planets, where each element planets[i] represents the maximum number of planets you can move forward from planet i. In simpler terms, standing on planet i, you can move to any planet from i+1 to i+planets[i], as long as you don't exceed the last planet.

Your goal is to reach the final planet (planet n-1) in the fewest number of moves possible.

It is guaranteed that a path to the final planet always exists.

Return the minimum number of moves needed to reach planet n-1.

Example 1
----------
Input:
2 3 1 0 4
Output:
2

Explanation:
- Move from planet 0 to planet 1.
- Move from planet 1 to planet 4 (last planet).

*/
import java.util.*;
class Solution {
	
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0, currentEnd = 0, farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
class JumpGame2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int arr[]=new int[data.length];
		for(int i=0;i<data.length;i++)
			arr[i]=Integer.parseInt(data[i]);
		
        System.out.println(new Solution().jump(arr));
	}
}

/* Test cases
case=1
input=2 3 0 1 4
output=2

case=2
input=7 4 8 2 4 1 5 3 2 4 5
output=2

case=3
input=1 1 2 3 2 1 1 1
output=5

case=4
input=1 1 1 1 1 1 1
output=6

case=5
input=2 2 2 2 2 2
output=3

case=6
input=1 2 3 0 0 2 1
output=4

case=7
input=2 3 1 5 1 2 1 1 1
output=3
*/