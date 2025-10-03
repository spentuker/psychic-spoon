// Last updated: 10/3/2025, 2:12:33 PM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int res = 0;
        
        for (int[] d : dominoes) {
            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);
            int key = a * 10 + b; 
            res += count[key];
            count[key]++;
        }
        
        return res;
    }
}
